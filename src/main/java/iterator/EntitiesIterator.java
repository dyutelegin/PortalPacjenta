package iterator;

import iterator.entity.Entity;

public interface EntitiesIterator {

    Entity first();

    Entity next();

    boolean done();

    Entity current();

}
