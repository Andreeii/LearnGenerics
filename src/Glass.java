public class Glass <T extends Liquid>{
    public T liquid;

    public String getLiquid() {
        return liquid.taste();
    }
}
