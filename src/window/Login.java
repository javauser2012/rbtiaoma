package window;

import sun.security.action.OpenFileInputStreamAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import data.*;
import tools.*;
public class Login extends JFrame {
    private Connection conn = new OpenSql().conn;
    private JLabel jl_username,Jl_userpasswd,jl_text = null;
    private JTextField jt_username = null;
    private JPasswordField jp_userpasswd = null;
    private JButton jb_login,jb_cancel,jb_reg = null;
    private ImageIcon img = new ImageIcon("src\\images\\Bit_Technology.png");
    private JLabel background = new JLabel(img);
    public Login(){
        this.setTitle("登陆");
        new tools(this);
        this.init();
        this.registerListener();
        this.setIconImage(img.getImage());
    }
    public void init(){
        this.setLayout(null);
        this.setSize(400, 200);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        tool.centered(this);
        background.setBounds(10,10,300,300);
        this.add(background);
        jl_username = new JLabel("用户名：");
        jl_username.setBounds(60,10,80,30);
        this.add(jl_username);
        Jl_userpasswd = new JLabel("密  码：");
        Jl_userpasswd.setBounds(60,55,80,30);
        this.add(Jl_userpasswd);
        jt_username = new JTextField();
        jt_username.setBounds(120,10,190,30);
        this.add(jt_username);
        jp_userpasswd = new JPasswordField();
        jp_userpasswd.setBounds(120,55,190,30);
        this.add(jp_userpasswd);
        jb_reg = new JButton("注册");
        jb_reg.setBounds(60,100,80,30);
        this.add(jb_reg);
        jb_login = new JButton("登录");
        jb_login.setBounds(160,100,80,30);
        this.add(jb_login);
//        this.getRootPane().setDefaultButton(jb_login);
        jb_cancel = new JButton("取消");
        jb_cancel.setBounds(260,100,80,30);
        this.add(jb_cancel);
        jl_text = new JLabel("");
        jl_text.setForeground(Color.red);
        jl_text.setBounds(100,135,200,30);
        this.add(jl_text);
        this.setVisible(true);
    }
    public void registerListener(){

    }
}
