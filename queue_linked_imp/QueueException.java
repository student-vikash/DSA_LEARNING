package queue_linked_imp;

import javax.management.relation.RelationNotFoundException;

public class QueueException extends RuntimeException {
    public QueueException(String message) {
        super(message);
    }
}
