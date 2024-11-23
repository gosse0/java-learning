package com.gosse.ui;

import javax.swing.*;

/**
 * className: RegisterJFrame
 * Package: com.gosse.ui
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-15 - 16:01
 */
public class RegisterJFrame extends JFrame {
    public RegisterJFrame(){
        initJFrame();
        //显示界面
        this.setVisible(true);
    }

    private void initJFrame() {
        //设置界面大小
        this.setSize(488,500);
        //设置标题
        this.setTitle("游戏注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置窗口居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
