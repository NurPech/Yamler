package helper;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.tags.CustomItemTagContainer;
import org.bukkit.persistence.PersistentDataContainer;

import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * An implementation of the default Bukkit {@link ItemStack} to provide
 * a similar ability to write/read the {@link ItemMeta} without CraftBukkit running.
 *
 * @author bibo38
 * @see ItemStack
 */
public class TestItemStack extends ItemStack {
    ItemMeta meta = null;

    /**
     * The common used constructor
     *
     * @param type The type of the ItemStack
     * @see ItemStack#ItemStack(Material)
     */
    public TestItemStack(Material type) {
        super(type);
    }

    @Override
    public ItemMeta getItemMeta() {
        if(meta == null)
            meta = new ItemMeta() {
                @Override
                public boolean hasDisplayName() {
                    return false;
                }

                @Override
                public String getDisplayName() {
                    return null;
                }

                @Override
                public void setDisplayName(String s) {
                }

                @Override
                public boolean hasLore() {
                    return false;
                }

                @Override
                public List<String> getLore() {
                    return null;
                }

                @Override
                public void setLore(List<String> list) {
                }

                @Override
                public boolean hasEnchants() {
                    return false;
                }

                @Override
                public boolean hasEnchant(Enchantment enchantment) {
                    return false;
                }

                @Override
                public int getEnchantLevel(Enchantment enchantment) {
                    return 0;
                }

                @Override
                public Map<Enchantment, Integer> getEnchants() {
                    return null;
                }

                @Override
                public boolean addEnchant(Enchantment enchantment, int i, boolean b) {
                    return false;
                }

                @Override
                public boolean removeEnchant(Enchantment enchantment) {
                    return false;
                }

                @Override
                public boolean hasConflictingEnchant(Enchantment enchantment) {
                    return false;
                }

                @Override
                public ItemMeta clone() {
                    return null;
                }

                @Override
                public Map<String, Object> serialize() {
                    return null;
                }

				@Override
				public PersistentDataContainer getPersistentDataContainer() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public boolean hasLocalizedName() {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public String getLocalizedName() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public void setLocalizedName(String name) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public boolean hasCustomModelData() {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public int getCustomModelData() {
					// TODO Auto-generated method stub
					return 0;
				}

				@Override
				public void setCustomModelData(Integer data) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void addItemFlags(ItemFlag... itemFlags) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void removeItemFlags(ItemFlag... itemFlags) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public Set<ItemFlag> getItemFlags() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public boolean hasItemFlag(ItemFlag flag) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public boolean isUnbreakable() {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public void setUnbreakable(boolean unbreakable) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public boolean hasAttributeModifiers() {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public Multimap<Attribute, AttributeModifier> getAttributeModifiers() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public Collection<AttributeModifier> getAttributeModifiers(Attribute attribute) {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public boolean addAttributeModifier(Attribute attribute, AttributeModifier modifier) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public void setAttributeModifiers(Multimap<Attribute, AttributeModifier> attributeModifiers) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public boolean removeAttributeModifier(Attribute attribute) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public boolean removeAttributeModifier(EquipmentSlot slot) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public boolean removeAttributeModifier(Attribute attribute, AttributeModifier modifier) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public String getAsString() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public CustomItemTagContainer getCustomTagContainer() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public void setVersion(int version) {
					// TODO Auto-generated method stub
					
				}
            };
        return meta;
    }

    @Override
    public boolean hasItemMeta() {
        return meta != null;
    }

    @Override
    public boolean setItemMeta(ItemMeta itemMeta) {
        meta = itemMeta;
        return true;
    }
}
