package Day5.Assignment2.Question1;

public class Snacks {
    String id;
    char size;
    float price;

    Snacks(int i, char size) {
        this.size = size;
        setID(size, i);
        setPrice(size, i);
    }

    public void display() {
        System.out.println(price + " " + id + " " + size);
    }

    public void setPrice(char size, int product) {
        if (product == 1) {

            if ((size == 'S') || (size == 's')) {
                this.price = 19.99f;
            } else if ((size == 'M') || (size == 'm')) {
                this.price = 29.99f;
            } else if ((size == 'L') || (size == 'l')) {
                this.price = 39.99f;
            }
        } else if (product == 2) {
            if ((size == 'S') || (size == 's')) {
                this.price = 19.99f;
            } else if ((size == 'M') || (size == 'm')) {
                this.price = 29.99f;
            }
            if ((size == 'L') || (size == 'l')) {
                this.price = 39.99f;
            }
        }
    }

    public void setID(char size, int product) {
        if (product == 1) {
            // fruity snacks
            if ((size == 'S') || (size == 's')) {
                this.id = "PRD-20231021-0001";
            } else if ((size == 'M') || (size == 'm')) {
                this.id = "PRD-20231021-0002";
            }
            if ((size == 'L') || (size == 'l')) {
                this.id = "PRD-20231021-0003";
            }
        } else if (product == 2) {
            // salty snack
            if ((size == 'S') || (size == 's')) {
                this.id = "PRD-20231021-0004";
            } else if ((size == 'M') || (size == 'm')) {
                this.id = "PRD-20231021-0005";
            }
            if ((size == 'L') || (size == 'l')) {
                this.id = "PRD-20231021-0006";
            }
        }
    }
}