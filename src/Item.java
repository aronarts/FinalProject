/**
 * Created by Chad Reddick on 11/15/15.
 * <p>
 *     Item Class is an object that is the for The PlayerPawn class' inventory.
 *     Has the option to be used, dropped, and destroyed for the sake of
 *     being a base class for food, weapons, loot, etc.
 * </p>
 */
public class Item extends Entity
{
    /**
     * <b>MyPawn</b>
     * Pawn object to hold the owner of this weapon
     */
    Pawn MyPawn;

    /**
     * <b>Name</b>
     * private
     * String to give the Item a name
     */
    private String Name;

    /**
     * <b>Pickup</b>
     * Method that picks up the Item
     */
    public void Pickup(){}

    /**
     * <b>Use</b>
     * Method that uses the Item. Can override
     * this method to have weapon fire as well
     */
    public void Use(){}

    /**
     * <b>Drop</b>
     * Method that Drops the Item
     */
    public void Drop(){}

    /**
     * <b>SetOwner</b>
     * Method that sets the Owner of the weapon
     * @param Owner new Pawn that owns this weapon
     */
    public void SetOwner(Pawn Owner)
    {
        if(Owner != null)
        {
            MyPawn = Owner;
        }
    }

    /**
     * <b><GetOwner/b>
     * Get method that returns MyPawn
     * @return MyPawn
     */
    public Pawn GetOwner()
    {
        return MyPawn;
    }
}
