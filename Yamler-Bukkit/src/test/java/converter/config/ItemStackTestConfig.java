package converter.config;

import helper.TestItemStack;
import net.cubespace.Yamler.Config.YamlConfig;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.tags.CustomItemTagContainer;
import org.bukkit.persistence.PersistentDataContainer;

import com.google.common.collect.Multimap;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The test configuration to check for a correct working ItemStack.
 *
 * @author bibo38
 * @see converter.ItemStackConverterTest
 */
public class ItemStackTestConfig extends YamlConfig {

    public TestItemStack cookie = new TestItemStack(Material.COOKIE);
    public TestItemStack specialWool = new TestItemStack(Material.WHITE_WOOL);

    /**
     * The default constructor is used to add the {@link net.cubespace.Yamler.Converter.ItemStack} converter
     * and add a special ItemMeta class to the {@link this#specialWool} variable to test the converter.
     *
     * @throws Exception When the converter cannot be added
     */
    public ItemStackTestConfig() throws Exception {
        addConverter(net.cubespace.Yamler.Converter.ItemStack.class);

        specialWool.setItemMeta(new ItemMeta() {
            @Override
            public boolean hasDisplayName() {
                return true;
            }

            @Override
            public String getDisplayName() {
                return "Test Wool";
            }

            @Override
            public void setDisplayName(String s) {
            }

            @Override
            public boolean hasLore() {
                return true;
            }

            @Override
            public List<String> getLore() {
                return Arrays.asList("This is Wool", "Good Wool");
            }

            @Override
            public void setLore(List<String> list) {
            }

            @Override
            public boolean hasEnchants() {
                return true;
            }

            @Override
            public boolean hasEnchant(Enchantment enchantment) {
                return Enchantment.LUCK.equals(enchantment);
            }

            @Override
            public int getEnchantLevel(Enchantment enchantment) {
                return hasEnchant(enchantment) ? 1 : 0;
            }

            @Override
            public Map<Enchantment, Integer> getEnchants() {
                HashMap<Enchantment, Integer> enchantments = new HashMap<>();
                enchantments.put(Enchantment.LUCK, 1);
                return enchantments;
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
        });
    }
}
