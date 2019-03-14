/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inArraySlots list = new List_inArraySlots();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

        // Populate the list with diverse elements.
        list.add( 10);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added string: " + list);

        list.add( "junk");
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added int: " + list);

        list.add( -1);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added double: " + list);

	int elemIndex = 0;
        // Add enough elements that expansion is expected
        for( ; elemIndex < 15; elemIndex++ ) {

            if( elemIndex == 10) System.out.println( "expansion expected");

            list.add( -elemIndex);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("result of expanded list: "
             + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

        // get tests
        for( int index = list.size() - 1; index >= 0; index--)
             System.out.println( index + ": " + list.get(index));
        
    }
}
