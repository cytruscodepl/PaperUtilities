package pl.cytruscode;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

import java.util.ArrayList;
import java.util.List;

public class TextUtils {
    public static Component deserialize(String msg){
        MiniMessage mm = MiniMessage.miniMessage();
        return mm.deserialize(msg);
    }
    public static List<Component> deserialize(List<String> msg){
        List<Component> serializedList = new ArrayList<>();
        for (String msgElement : msg){
            serializedList.add(deserialize(msgElement));
        }
        return serializedList;
    }
}
