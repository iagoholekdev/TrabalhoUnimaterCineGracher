package main.api.utils.interfaces;

public interface CrudContract<T, E> {

    E create(T entidade);

}
