package com.eerussianguy.firmalife.common.recipes.data;

import com.eerussianguy.firmalife.common.FLHelpers;
import net.dries007.tfc.common.recipes.outputs.ItemStackModifier;
import net.dries007.tfc.common.recipes.outputs.ItemStackModifiers;

public class FLItemStackModifiers
{
    public static void init()
    {
        register("pie", PieModifier.INSTANCE);
        register("add_pie_pan", AddPiePanModifier.INSTANCE);
        register("pizza", PizzaModifier.INSTANCE);
        register("copy_dynamic_food", CopyDynamicFoodModifier.INSTANCE);
        register("burrito", BurritoModifier.INSTANCE);
        register("empty_pan", EmptyPanModifier.INSTANCE);
    }

    private static void register(String name, ItemStackModifier.Serializer<?> serializer)
    {
        ItemStackModifiers.register(FLHelpers.identifier(name), serializer);
    }
}
