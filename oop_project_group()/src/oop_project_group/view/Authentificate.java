
package oop_project_group.view;


public class Authentificate {
    
    public static  boolean Validate(String userName, String password) {
        if (userName.equals("student") && password.equals("password")){
            return true;
        }
        return false;
    }
    
 
}

        /*
        Group members
        =============
        
        Name                                 Registration Number
        ====                                 ===================
        BAMATA WA BAMATA Maurice             18/420/BSSE-S
        NDAHURA BASARA Moses                 19/231/BIT-S
        ALLY KALIMA                          18/1097/BIT-S
        NANNYUNJA NOELINA                    19/536/BSCS-S
        */