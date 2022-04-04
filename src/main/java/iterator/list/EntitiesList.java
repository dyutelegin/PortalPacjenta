package iterator.list;

import iterator.EntitiesIterator;

public interface EntitiesList {

    EntitiesIterator createIterator(int step);

}
