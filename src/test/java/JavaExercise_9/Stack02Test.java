package JavaExercise_9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {

    @BeforeEach
    void setUp() {
        System.out.println("before each");
    }

    @Test
    @DisplayName("push 가 잘 되는지")
    void push() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    void pushAndPop() {

        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
        //스택이 비어있을때 pop()를 하면
        //Exception예외의 검증
        assertThrows(EmptyStackException.class,()->{
            st.pop();//ArrayIndexOutOfBoundsException
        });

    }

    @Test
    void isEmpty() {//비었을때,값이 들어있을때,값을 뺐을때
        Stack02 st = new Stack02();
        assertTrue(st.isEmpty());
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());
    }

    @Test
    void realStack() {
        Stack<Integer> st  = new Stack<>();
        assertThrows(EmptyStackException.class,()->{
            st.pop();//EmptyStackException//throw new EmptyStackException();
        });
    }

    @Test
    void peek() {
        Stack02 st = new Stack02();
        assertThrows(EmptyStackException.class, () ->{
            st.peek();
        });
        st.push(10);
        int peeked = st.peek();
        assertEquals(10,peeked);
        //negative case 테스트 stack비었을때 peek
        //EmptyStackException
    }
}