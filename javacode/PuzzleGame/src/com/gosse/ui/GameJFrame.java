package com.gosse.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * className: GameJFrame
 * Package: com.gosse.ui
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-15 - 15:58
 */
public class GameJFrame extends JFrame implements KeyListener,ActionListener {
    //加载的图片顺序
    int[][] data = new int[4][4];
    //空白位置
    int xPos, yPos;
    //图片路径
    String path = "image/animal/animal3/";
    //胜利条件
    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}};
    //目录条目
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登陆");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");

    JMenuItem beautyItem = new JMenuItem("美女");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");


    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据
        initData();

        //初始化图片、背景
        initImage();

        //显示界面
        this.setVisible(true);
    }

    //随即开始的顺序
    private void initData() {
        //定义数组
        int[] temArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //打乱
        Random r = new Random();
        for (int i = 0; i < temArr.length; i++) {
            int index = r.nextInt(temArr.length);
            int tem = temArr[index];
            temArr[index] = temArr[i];
            temArr[i] = tem;
        }
        //初始化data数组
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                data[i][j] = temArr[4 * i + j];
                if (data[i][j] == 0) {
                    xPos = i;
                    yPos = j;
                }
            }
        }

    }

    //初始化添加图片
    private void initImage() {
        this.getContentPane().removeAll();

        if (vectory()) {
            System.out.println("win");
            JLabel winJLabel = new JLabel(new ImageIcon("image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }
        //添加打乱的图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = data[i][j];
                //创建图片对象
                ImageIcon icon1 = new ImageIcon(path + number + ".jpg");
                //创建容器管理Jlabel对象
                JLabel jLabel1 = new JLabel(icon1);
                //指定位置
                jLabel1.setBounds(105 * j + 83, 105 * i + 134, 105, 105);

                jLabel1.setBorder(new BevelBorder(BevelBorder.RAISED));
                //把管理容器添加到界面中
                this.getContentPane().add(jLabel1);
            }
        }
        //添加背景图片
        ImageIcon icon = new ImageIcon("image/background.png");
        JLabel jLabel = new JLabel(icon);
        jLabel.setBounds(40, 40, 508, 560);

        this.getContentPane().add(jLabel);


        //刷新
        this.getContentPane().repaint();
    }

    //界面的初始化
    private void initJFrame() {
        //设置界面大小
        this.setSize(603, 680);
        //设置标题
        this.setTitle("拼图单机版");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置窗口居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中
        this.setLayout(null);
        //添加界面的键盘监听
        this.addKeyListener(this);
    }

    //菜单的初始化
    private void initJMenuBar() {
        //创建菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建选项对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        JMenu changeJMenu = new JMenu("更换图片");

        //条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        beautyItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);

        //条目加入选项
        changeJMenu.add(beautyItem);
        changeJMenu.add(animalItem);
        changeJMenu.add(sportItem);
        functionJMenu.add(changeJMenu);


        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);


        //选项加入菜单栏中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);

    }

    //胜利
    private boolean vectory() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                if (data[i][j] != win[i][j]) return false;
        }
        return true;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (vectory()) return;
        int code = e.getKeyCode();
        if (code == 'A') {
            this.getContentPane().removeAll();
            //加入完整图片
            ImageIcon icon = new ImageIcon(path + "all.jpg");
            JLabel all = new JLabel(icon);
            all.setBounds(83, 134, 105 * 4, 105 * 4);
            this.getContentPane().add(all);
            //加入背景
            JLabel background = new JLabel(new ImageIcon("image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);

            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //如果胜利，不再接收
        if (vectory()) return;


        int code = e.getKeyCode();

        //移动
        if (code >= 37 && code <= 40) {
            code -= 37;//左、上、右、下
            int[][] moveDir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            int xTarget = xPos + moveDir[code][0];
            int yTarget = yPos + moveDir[code][1];
            if (xTarget < 0 || xTarget > 3 || yTarget < 0 || yTarget > 3) return;
            //System.out.println("" + xPos + "," + yPos);
            data[xPos][yPos] = data[xTarget][yTarget];
            data[xTarget][yTarget] = 0;
            xPos += moveDir[code][0];
            yPos += moveDir[code][1];
            initImage();
        } else if (code == 'A') {
            //System.out.println("a");
            initImage();
        } else if (code == 'W') {
            //System.out.println("a");
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            xPos = 3;
            yPos = 3;
            initImage();
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == reLoginItem){
            System.out.println("重新登陆");
            this.setVisible(false);
            new LoginJFrame();
        } else if (obj == replayItem) {
            System.out.println("重新开始");
            initData();
            initImage();
        } else if (obj == closeItem) {
            System.out.println("关闭");
            System.exit(0);

        } else if (obj == accountItem) {
            //创建弹窗
            JDialog jDialog = new JDialog();
            //管理图片的对象jlable
            JLabel jLabel = new JLabel(new ImageIcon("image/about.png"));
            jLabel.setBounds(0,0,258,258);
            //添加入弹窗
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(334,334);
            //置顶、居中、强制选择
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            //显示
            jDialog.setVisible(true);

        } else if (obj == sportItem) {
            Random r = new Random();
            int cnt = r.nextInt(10)+1;
            path = "image/sport/sport"+cnt+"/";
            System.out.println(path);
            initData();
            initImage();
        }
        else if (obj == beautyItem) {
            Random r = new Random();
            int cnt = r.nextInt(10)+1;
            path = "image/girl/girl"+cnt+"/";
            System.out.println(path);
            initData();
            initImage();
        }
        else if (obj == animalItem) {
            Random r = new Random();
            int cnt = r.nextInt(10)+1;
            path = "image/animal/animal"+cnt+"/";
            System.out.println(path);
            initData();
            initImage();
        }
    }
}
