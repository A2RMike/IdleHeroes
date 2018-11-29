/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mike.idleheroes.DTO;

import java.util.Objects;

/**
 *
 * @author miche
 */
public class HeroDTO {
    
    private long ID;
    private long ID_Class;
    private long ID_Faction;
    private long ID_Tier;
    private String Name;
    private String Description;
    private String Image;
    private String Skill_1;
    private String Skill_2;
    private String Skill_3;
    private String Skill_4;

    public HeroDTO() {
    }

    public HeroDTO(long ID, long ID_Class, long ID_Faction, long ID_Tier, String Name, String Description, String Image, String Skill_1, String Skill_2, String Skill_3, String Skill_4) {
        this.ID = ID;
        this.ID_Class = ID_Class;
        this.ID_Faction = ID_Faction;
        this.ID_Tier = ID_Tier;
        this.Name = Name;
        this.Description = Description;
        this.Image = Image;
        this.Skill_1 = Skill_1;
        this.Skill_2 = Skill_2;
        this.Skill_3 = Skill_3;
        this.Skill_4 = Skill_4;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getID_Class() {
        return ID_Class;
    }

    public void setID_Class(long ID_Class) {
        this.ID_Class = ID_Class;
    }

    public long getID_Faction() {
        return ID_Faction;
    }

    public void setID_Faction(long ID_Faction) {
        this.ID_Faction = ID_Faction;
    }

    public long getID_Tier() {
        return ID_Tier;
    }

    public void setID_Tier(long ID_Tier) {
        this.ID_Tier = ID_Tier;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
     public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getSkill_1() {
        return Skill_1;
    }

    public void setSkill_1(String Skill_1) {
        this.Skill_1 = Skill_1;
    }

    public String getSkill_2() {
        return Skill_2;
    }

    public void setSkill_2(String Skill_2) {
        this.Skill_2 = Skill_2;
    }

    public String getSkill_3() {
        return Skill_3;
    }

    public void setSkill_3(String Skill_3) {
        this.Skill_3 = Skill_3;
    }

    public String getSkill_4() {
        return Skill_4;
    }

    public void setSkill_4(String Skill_4) {
        this.Skill_4 = Skill_4;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.ID ^ (this.ID >>> 32));
        hash = 37 * hash + (int) (this.ID_Class ^ (this.ID_Class >>> 32));
        hash = 37 * hash + (int) (this.ID_Faction ^ (this.ID_Faction >>> 32));
        hash = 37 * hash + (int) (this.ID_Tier ^ (this.ID_Tier >>> 32));
        hash = 37 * hash + Objects.hashCode(this.Name);
        hash = 37 * hash + Objects.hashCode(this.Description);
        hash = 37 * hash + Objects.hashCode(this.Image);
        hash = 37 * hash + Objects.hashCode(this.Skill_1);
        hash = 37 * hash + Objects.hashCode(this.Skill_2);
        hash = 37 * hash + Objects.hashCode(this.Skill_3);
        hash = 37 * hash + Objects.hashCode(this.Skill_4);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HeroDTO other = (HeroDTO) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (this.ID_Class != other.ID_Class) {
            return false;
        }
        if (this.ID_Faction != other.ID_Faction) {
            return false;
        }
        if (this.ID_Tier != other.ID_Tier) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.Image, other.Image)) {
            return false;
        }
        if (!Objects.equals(this.Skill_1, other.Skill_1)) {
            return false;
        }
        if (!Objects.equals(this.Skill_2, other.Skill_2)) {
            return false;
        }
        if (!Objects.equals(this.Skill_3, other.Skill_3)) {
            return false;
        }
        if (!Objects.equals(this.Skill_4, other.Skill_4)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HeroDTO{" + "ID=" + ID + ", ID_Class=" + ID_Class + ", ID_Faction=" + ID_Faction + ", ID_Tier=" + ID_Tier + ", Name=" + Name + ", Description=" + Description + ", Image=" + Image + ", Skill_1=" + Skill_1 + ", Skill_2=" + Skill_2 + ", Skill_3=" + Skill_3 + ", Skill_4=" + Skill_4 + '}';
    }
    
}
