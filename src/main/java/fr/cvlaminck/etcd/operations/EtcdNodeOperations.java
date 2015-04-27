package fr.cvlaminck.etcd.operations;

import fr.cvlaminck.etcd.nodes.EtcdNode;

/**
 * Created by cyr62110 on 26/04/15.
 */
public interface EtcdNodeOperations {

    public EtcdNode getRoot();

    /**
     * Refresh a node.
     * List all children if the node is a directory, or get the new value
     */
    public void refresh(EtcdNode node);

    /**
     * Persists all changes done on a node.
     * If the remote node do not exists, it will be created.
     */
    public void save(EtcdNode node);

}
