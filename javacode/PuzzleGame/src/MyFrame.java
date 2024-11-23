import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * className: MyFrame
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-16 - 0:52
 */
public class MyFrame extends JFrame implements ActionListener {
    JButton jbt1 = new JButton("按钮");
    MyFrame(){
        //设置界面大小
        this.setSize(603,680);
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


        jbt1.setBounds(0,0,100,50);

        jbt1.addActionListener(this);

        this.getContentPane().add(jbt1);



        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random r = new Random();
        jbt1.setBounds(r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100));
        System.out.println("点击了");
    }
}
