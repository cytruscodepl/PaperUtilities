package pl.cytruscode.player;


import org.bukkit.Material;
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
    public static Inventory addItem(Inventory inv, ItemStack item){
        for (int i = 0; i < inv.getSize(); i++){
            if (inv.getItem(i) == null || inv.getItem(i).getType() == Material.AIR){
                inv.setItem(i, item);
                return inv;
            }
        }
        return inv;
    }
    public static boolean containsItem(Inventory inv, ItemStack item){
        for (int i = 0; i < inv.getSize(); i++){
            if (inv.getItem(i) == item){
                return true;
            }
        }
        return false;
    }
    public static Inventory removeItem(Inventory inv, ItemStack item){
        inv.remove(item);
        return inv;
    }
}
