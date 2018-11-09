package com.h3c.jdk8;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Created by LENOVO on 2016/12/21.
 */
public class SwingTest1 {
    public static void main(String[] args) {
//       JFrame jframe = new JFrame("myframe");
//       JButton button = new JButton("button");
//       button.addActionListener(new ActionListener() {
//           @Override
//           public void actionPerformed(ActionEvent e) {
//               System.out.println("clicked me !");
//           }
//       });
//       jframe.add(button);
//       jframe.pack();
//       button.setVisible(true);
//       jframe.setVisible(true);
//       jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);EXIT_ON_CLOSE
        System.out.println("return value is : " + testOut());
    }

    public static String testOut() {
        System.out.println("start test ");
        Properties properties = System.getProperties();
        Set set = properties.keySet();
        for (Iterator item = set.iterator(); item.hasNext(); ) {
            String key = (String) item.next();
            String value = properties.getProperty(key);
            System.out.println(item.next());
        }

        new Thread(() -> {
            try {
                Thread.sleep(10000);
                System.out.println("sdsdds");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        return "hello cloudos";
    }

}
