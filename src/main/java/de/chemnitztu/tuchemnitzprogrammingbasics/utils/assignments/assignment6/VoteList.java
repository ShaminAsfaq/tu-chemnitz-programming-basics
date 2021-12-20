package de.chemnitztu.tuchemnitzprogrammingbasics.utils.assignments.assignment6;

public class VoteList {
    private Node head;

    public VoteList() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public boolean add(Vote data) {
        Node newNode = new Node(data);
        newNode.setNext(null);

        Node foundHead = getHead();
        try {
            if (foundHead == null) {
                this.setHead(newNode);
                return true;
            } else {
                Node lastNode = foundHead;

                while (true) {
                    if (lastNode.getNext() == null) break;
                    lastNode = lastNode.getNext();
                }
                lastNode.setNext(newNode);
                return true;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public int importVotes(Vote[] arrayOfVotes) {
        int length = arrayOfVotes.length;
        int totalAdded = 0;

        for(int idx = 0; idx < length; idx++) {
            boolean addedFlag = add(arrayOfVotes[idx]);
            if (addedFlag) {
                ++totalAdded;
            }
        }
        return totalAdded;
    }

    public boolean isValid() {
        Node head = getHead();
        int totalVotes = 0;
        int totalInvalids = 0;
        boolean validity = false;

        while (true) {
            if (head == null) {
                break;
            }
            ++totalVotes;
            if (head.getData().equals(Vote.INVALID)) {
                ++totalInvalids;
            }
            head = head.getNext();
        }
        if (totalVotes > 0) {
            double percentage = (double) (100*totalInvalids) / totalVotes;

            if (percentage <= 40) {
                validity = true;
            }
        }
        return validity;
    }

    public Vote countVotes() {
        boolean validity = isValid();
        int yes = 0;
        int no = 0;

        if (!validity) {
            return Vote.INVALID;
        }

        Node head = getHead();
        while (true) {
            if (head == null) {
                break;
            }

            if (head.getData().equals(Vote.YES)) {
                ++yes;
            } else if (head.getData().equals(Vote.NO)) {
                ++no;
            }
            head = head.getNext();
        }

        if (yes > no) {
            return Vote.YES;
        } else if (no > yes) {
            return Vote.NO;
        } else {
            return Vote.INVALID;
        }
    }
}
