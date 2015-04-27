package fr.cvlaminck.etcd.internal.nodes;

import fr.cvlaminck.etcd.internal.nodes.operations.AbstractEtcdNodeOperation;

import java.util.List;

/**
 * Created by cyr62110 on 27/04/15.
 */
public class AbstractEtcdNode {

    /**
     *
     */
    public boolean persisted;

    /**
     * List of all operation executed on a persisted node but not persisted on
     * etcd cluster.
     */
    public List<AbstractEtcdNodeOperation> pendingOperations;



    public boolean isPersisted() {
        return persisted;
    }
}
