class Name{
    private String name;
    public void SetName(String name){
                    this.name = name;
                }
    public String GetName(){
                    return this.name;
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        Name n = new Name();
        n.SetName("Kavi");
        System.out.println(n.GetName());
    }
}