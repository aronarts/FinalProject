/**
 * Created by Chad Reddick on 11/15/15.
 * <p>
 *     Pawn Class is an object that the Controller Possesses. Think of this Object
 *     like a soul and a vessel. A soul(Controller) can only control something unless
 *     there is a vessel(Pawn) to possess. Each one cannot work without one another.
 * </p>
 */

public class Pawn extends Entity
{
    /**
    int Health
    * private
    * Holds the Health value for the Pawn
    * Use the GetHealth() method to get the Health value
     */
    private int Health;

    /**
    int Armor
    * private
    * Holds the Armor value for the Pawn
    * Use the GetArmor() method to get the Armor value
     */
    private int Armor;


    /**
     * MagicResistance
     * private
     * integer variable to debate how much MR(Magic Resistance) the Pawn has
     */
    private int MagicResistance;

    /**
    boolean bIsDead
    * private
    * holds the boolean value to check if Pawn is dead
    * Use the IsDead() method to get the bIsDead boolean value
     */
    private boolean bIsDead;


    /**
    Move method
    * Method that Allows the pawn to move in directions according to the Level grid
     * @param x Vector2D X coordinate
     * @param y Vector2D Y coordinate
     */
    public void Move(int x, int y)
    {
        SetLocation(x,y);
    }

    /**
    Interact Method
    * Method that Allows the Pawn to interact with the world.
    */
    public void Interact(){}


    /**
    GetHealth
    * @return the integer value of Health
    */
    public int GetHealth()
    {
        return Health;
    }

    /**
    SetHealth
    * Method that Sets the health of the Pawn
    * @param NewHealth  integer value parameter for the new health amount
    */
    public void SetHealth(int NewHealth)
    {
        if(NewHealth <= 100 && NewHealth > 0)
        {
            Health = NewHealth;
        }
        else
        {
            Health = 100;
        }
    }

    /**
    AddHealth
    * Method that Adds Health to the Pawn
    * @param AddedHealth  integer value parameter of how much health to add
    */
    public void AddHealth(int AddedHealth)
    {
        if((Health + AddedHealth) < 100)
        {
            Health += AddedHealth;
        }
        else
        {
            Health = 100;
        }
    }

    /**
     SetArmor
     * Method that Sets the new value for Armor
     * @param NewArmor  integer value for a new Armor amount
     */
    public void SetArmor(int NewArmor)
    {
        if(Armor <= 100 && Armor >= 0)
        {
            Armor = NewArmor;
        }
    }

    /**
     AddArmor
     * Method that Adds to the integer value of Armor
     * @param AddedArmor  integer value to add more to Armor
    */
    public void AddArmor(int AddedArmor)
    {
        if((Armor + AddedArmor) < 100)
        {
            Armor += AddedArmor;
        }
        else
        {
            Armor = 100;
        }
    }

    /**
     * GetMagicResistance
     * Method that gets the MagicResistance value
     * @return MagicResistance
     */
    public int GetMagicResistance()
    {
        return MagicResistance;
    }

    /**
     * SetMagicResistance
     * Method that sets the new MagicResistance value
     * @param NewMR  integer value parameter that sets the new MR value
     */
    public void SetMagicResistance(int NewMR)
    {
        MagicResistance = NewMR;
    }

    /**
     * AddMagicResistance
     * Method that adds to the MagicResistance value
     * @param AddedMR  integer value parameter that adds to MagicResistance
     */
    public void AddMagicResistance(int AddedMR)
    {
        MagicResistance += AddedMR;
    }


    /**
     * DecreaseMagicResistance
     * Method that decrements the MagicResistance value
     * @param DecrementedMR  integer value parameter to decrease the MagicResistance
     */
    public void DecreaseMagicResistance(int DecrementedMR)
    {
        if(MagicResistance > 0)
        {
            MagicResistance -= DecrementedMR;
        }
        else
        {
            MagicResistance = 0;
        }
    }

    /**
    TakeDamage
    * Method that is in charge of the damage application from another Pawn
    * @param Damage  integer value parameter for how much damage has been done
    * @param Instigator  Controller object parameter for "Who" applied the damage
     *@param TypeOfDamage  DamageType object parameter for how will the damage will be distributed
     *@see Controller  for info about controller fundamentals
     *@see DamageType  for DamageType concept
    */
    public void TakeDamage(int Damage, Controller Instigator, DamageType TypeOfDamage)
    {
        if(Health > 0)
        {
            if(Instigator != null)
            {

            }
            Health -= Damage;
        }
    }

    /**
    GetArmor
    * @return the integer value of Armor
    */
    public int GetArmor()
    {
        return Armor;
    }

    /**
    IsDead
    * essentially checks if the pawn is dead based on the Pawn's Health
    * @return the boolean value of bIsDead
    */
    public boolean IsDead()
    {
        if(Health <= 0)
        {
            bIsDead = true;
        }
        else
        {
            bIsDead = false;
        }
        return bIsDead;
    }
}