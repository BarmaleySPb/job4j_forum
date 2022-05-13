package forum.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GenAdminPassword {
        public static void main(String[] args) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String pwd = encoder.encode("enter_password");
            System.out.println(pwd);
        }

}
