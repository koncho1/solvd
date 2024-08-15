//javac UserInfo.java
//java UserInfo arg1 arg2 ...

class UserInfo {
    public static void main(String[] args) {
	for(int i=0;i<args.length;i++)
        System.out.println(args[i]);
    }
}