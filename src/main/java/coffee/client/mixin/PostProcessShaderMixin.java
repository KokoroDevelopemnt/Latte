/*
 * Copyright (c) 2022 Coffee Client, 0x150 and contributors.
 * Some rights reserved, refer to LICENSE file.
 */

package coffee.client.mixin;

import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.PostProcessShader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(PostProcessShader.class)
public interface PostProcessShaderMixin {
    @Mutable
    @Accessor("input")
    void renderer_setInput(Framebuffer framebuffer);

    @Mutable
    @Accessor("output")
    void renderer_setOutput(Framebuffer framebuffer);
}
