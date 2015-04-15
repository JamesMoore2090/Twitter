
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
public class FollowersComparatorByUser implements Comparator<Followers>{
    @Override
    public int compare(Followers o1, Followers o2) {
        return o1.getUser().compareTo(o2.getUser());
    }
}
