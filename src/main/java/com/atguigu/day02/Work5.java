//??????????????? ???????????? xx��?xx????xx??
public class Work5{
    public static void main(String[] args){
        int seconds = 3800;
        int hours = seconds / 3600 ;
        int minute = seconds % 3600 /60;
        seconds = seconds % 60;
        System.out.println(hours+"��?"+minute+"????"+seconds+"??");
    }
}