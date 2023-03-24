import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {

    @Test
    void taskTest() {
        var task = new Task();
        assertEquals(78, task.recruitTask1(new int[]{5, 6, 11, 3, 4, 1}));
        assertEquals(142, task.recruitTask1(new int[]{5, 6, 11, 3, 4, 1, 5, 4, 3, 2, 1, 1, 13, 5, 6, 1}));
        assertEquals(102, task.recruitTask1(new int[]{0,1,1,0,11,5,6,7,4,12,7}));
    }
}