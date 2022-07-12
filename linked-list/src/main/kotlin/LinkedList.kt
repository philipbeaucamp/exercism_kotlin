private data class Node<T>(var next: Node<T>?, var previous: Node<T>?,val value :T)

class Deque<T> {

    private var head :Node<T>? = null
    private var tail : Node<T>? = null


    fun push(value: T) {
        head.let { old ->
            head = Node(null,old,value)
            old?.next = head
            if(tail == null) tail = head
        }
    }

    fun pop(): T? {
        val oldValue = head?.value
        head = head?.previous
        return oldValue
    }

    fun unshift(value: T) {
        tail.let {old ->
            tail = Node(old,null,value)
            old?.previous = tail
            if(head == null) head = tail
        }
    }

    fun shift(): T? {
        val oldValue = tail?.value
        tail = tail?.next
        return oldValue
    }
}
