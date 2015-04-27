package fr.cvlaminck.etcd.nodes;

import java.util.Collection;

/**
 *
 *
 * None of the methods make network call, you must call {@link EtcdNodeOperations.refresh} on this
 * node if you want the latest value, children, etc. You must also call {@link EtcdNodeOperations.save} to
 * persist the change you have done on this node on the cluster.
 */
public interface EtcdNode {

    /**
     * Returns true if the node is a leaf.
     */
    public boolean hasValue();

    public String getValue();

    public String setValue(String value);

    /**
     * Returns false if this node is the root node.
     */
    public boolean hasParent();

    /**
     * Returns the directory node containing this node.
     */
    public EtcdNode getParent();

    /**
     * Returns true if the node is a directory
     */
    public boolean hasChildren();

    public Collection<EtcdNode> getChildren();


    public void appendChild(EtcdNode node);

}
