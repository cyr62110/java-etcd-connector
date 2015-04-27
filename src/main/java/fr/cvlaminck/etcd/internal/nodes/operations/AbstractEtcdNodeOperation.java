package fr.cvlaminck.etcd.internal.nodes.operations;

import fr.cvlaminck.etcd.nodes.EtcdNode;

/**
 *
 */
public interface AbstractEtcdNodeOperation {

    public void executeOn(EtcdNode node);

    public void executeOnRemote();

}
