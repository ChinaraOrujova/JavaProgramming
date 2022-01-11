package day14_String;

public class EmailDomain_Substring {
    public static void main(String[] args) {


                String email ="Cydeo.School@gmail.com";
                String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
                System.out.println(domain);

            }
        }
