/**
 *Represents a deck of Objects that can be drawn from
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public abstract class ObjectDeck {
    private Object[] objects;

    /**
     * Creates an ObjectDeck with the passed list of Objects
     *
     * @param objects list of Objects to be added to the ObjectDeck
     *
     */
    public ObjectDeck(Object[] objects) {
        this.objects = objects;
    }

    /**
     * @return an Object originating from this ObjectDeck
     *
     */
    public Object deal() {
        /* if (objects.length == 0) {
            return null;
        }
        Object out = objects[objects.length - 1];
        Object[] temp = new Object[objects.length - 1];
        for (int i = 0; i < objects.length - 2; i++) {
            temp[i] = objects[i];
        }
        objects = temp;
        return out; */
        Object out = null;
        int index = objects.length - 1;
        while (index > 0) {
            if (objects[index] != null) {
                out = objects[index];
                objects[index] = null;
                return out;
            }
            index--;
        }
        return out;
    }

    /**
     * @return the number of Objects in this ObjectDeck
     *
     */
    public int size() {
        return objects.length;
    }

    /**
     * @return true if this ObjectDeck contains no Objects
     *
     */
    public boolean isEmpty() {
        if (objects.length == 0) {
            return true;
        }
        return false;
    }
}
