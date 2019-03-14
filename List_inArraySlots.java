public class List_inArraySlots {
    private Object[] contents;
    private int terminus; //index of the last element
    private static final int INIT_CAP = 8;

    /**
      Construct an empty list with a small initial capacity.
     */ 
    public List_inArraySlots() {
        contents = new Object[INIT_CAP];
        terminus = -1;
    }

    /**
      @return the number of elements in this list
     */
    public int size() {
	return terminus + 1;
    }

    /**
       @return a string representation of this list,
       in [a,b,c,] format
      */   
    public String toString() {
        String str_rep = "[";
        for (int index = 0; index <= terminus; index++) {
            str_rep += contents[index] + ", ";
        }
        return str_rep + "]";
    }

    /**
      Appends @value to the end of this list.
      @return true, in keeping with conventions yet to be discussed
     */
    public boolean add(Object item) {
        if (terminus + 1 == contents.length) expand();
        contents[++terminus] = item;
	return true;
    }

    /**
      @returns the value of the elements
        at the given index
     */
    public Object get(int index) {
        return contents[ index];
    }

    /**
      Appends @value to the end of this list.
      @return true, in keeping with conventions yet to be discussed
     */
    public void expand() {
        Object[] more_content = new Object[contents.length * 2];
        for (int i = 0; i <= terminus; i++) {
            more_content[i] = contents[i];
        }
        contents = more_content;
    }
}
