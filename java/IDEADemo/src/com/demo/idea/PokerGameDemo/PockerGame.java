package com.demo.idea.PokerGameDemo;

import java.util.*;

/**
 * @Author: 史传正
 * @Create: 2024-11-01-18:35
 * -------------------------
 * className: PockerGame
 * Description:
 */
public class PockerGame {

    // 牌盒
    static public ArrayList<Integer> list = new ArrayList<>();
    // 对应的扑克输出
    static public HashMap<Integer, String> mp = new HashMap<>();


    static {
        String[] color = {"♠", "♦", "♣", "♥"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "1", "2"};
        int cnt = 1;
        for(String n : number){
            for(String c:color){
                list.add(cnt);
                mp.put(cnt,c + n);
                cnt++;
            }
        }
        list.add(cnt);
        mp.put(cnt,"小王");
        cnt++;
        list.add(cnt);
        mp.put(cnt,"大王");
    }


    public void play(){
        // 洗牌
        Collections.shuffle(list);


        // 发牌
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> lord = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            int pokerId = list.get(i);
            if(i<3) lord.add(pokerId);
            else if(i%3==0)
                player1.add(pokerId);
            else if(i%3==1)
                player2.add(pokerId);
            else
                player3.add(pokerId);
        }


        // 看牌
        lookPoker("张三", player1);
        lookPoker("李四", player2);
        lookPoker("我", player3);
        lookPoker("底牌", lord);

    }

    public void lookPoker(String name, TreeSet<Integer> ts){
        StringJoiner sj = new StringJoiner(", ", "姓名："+ name + "：[", "]");
        for (Integer t : ts) {
            sj.add(mp.get(t));
        }
        System.out.println(sj);
    }


}
