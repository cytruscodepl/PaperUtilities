package pl.cytruscode.player;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.resource.ResourcePackInfo;
import net.kyori.adventure.resource.ResourcePackRequest;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

import java.net.URI;

public class ResourcePackUtils {
    public static ResourcePackInfo generatePackInfo(URI uri, String hash){
        return ResourcePackInfo.resourcePackInfo()
                .uri(uri)
                .hash(hash)
                .build();
    }
    public static void applyResoucePack(@NotNull Audience target, @NotNull ResourcePackInfo resourcePack, Component prompt, boolean isRequired){
        ResourcePackRequest request = ResourcePackRequest.resourcePackRequest()
                .packs(resourcePack)
                .prompt(prompt)
                .required(isRequired)
                .build();
        target.sendResourcePacks(request);

    }
    public static void clearResourcePacks(@NotNull Audience target){
        target.clearResourcePacks();
    }
}
