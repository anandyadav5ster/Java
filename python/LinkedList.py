
class Node:
    def __init__(self,data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def insert(self,newNode):
            if self.head is None:
                self.head = newNode
            else:
                lastNode = self.head
            while True:
                if lastNode.next is None:
                    break
                lastNode = lastNode.next
            lastNode.next = newNode


# create node
firstnode = Node('john')
linklist = LinkedList()
linklist.insert(firstnode)
secondnode = Node('Ben')
linklist.insert(secondnode)
thirdnode = Node('Tom')
linklist.insert(thirdnode)

def printlist(self):
        currentNode = self.head
        while True:
            if currentNode is None:
                    break
            print(currentNode.data)
            currentNode = currentNode.next



