package pl.cytruscode.item;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemStackUtils {
    public static ItemStack createItemStack(Material material, Component name, List<Component> lore){
        ItemStack is = new ItemStack(material, 1);
        ItemMeta im = is.getItemMeta();
        im.displayName(name);
        im.lore(lore);
        is.setItemMeta(im);
        return is;
    }
    public static ItemStack applyCustomModelData(ItemStack itemStack, Integer customModelData){
        ItemMeta im = itemStack.getItemMeta();
        im.setCustomModelData(customModelData);
        itemStack.setItemMeta(im);
        return itemStack;
    }
    public static ItemStack repair(ItemStack itemStack){
        ItemMeta im = itemStack.getItemMeta();
        if (im instanceof Damageable damageable){
            damageable.setDamage(0);
        }
        itemStack.setItemMeta(im);
        return itemStack;
    }

}
