package pl.cytruscode;


import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryUtils {
    public static boolean isFull(Inventory inv){
        for (ItemStack item : inv.getContents()){
            if (item == null){
                return false;
            }
        }
        return true;
    }
    public static void addItem(Inventory inv, ItemStack item){
        for (int i = 0; i < inv.getContents().length; i++){
            if (inv.getItem(i) == null){
                inv.setItem(i, item);
                return;
            }
        }
    }
}
