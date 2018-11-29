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
public class FactionDTO {
    
    private long ID;
    private String Name;
    private String Weakness;

    public FactionDTO() {
    }

    public FactionDTO(long ID, String Name, String Weakness) {
        this.ID = ID;
        this.Name = Name;
        this.Weakness = Weakness;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getWeakness() {
        return Weakness;
    }

    public void setWeakness(String Weakness) {
        this.Weakness = Weakness;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (int) (this.ID ^ (this.ID >>> 32));
        hash = 41 * hash + Objects.hashCode(this.Name);
        hash = 41 * hash + Objects.hashCode(this.Weakness);
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
        final FactionDTO other = (FactionDTO) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Weakness, other.Weakness)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FactionDTO{" + "ID=" + ID + ", Name=" + Name + ", Weakness=" + Weakness + '}';
    }
    
}
