
import com.nguyendangphu.mathutil.MathUtilyti;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pro
 */
public class test {
   
    @Test
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        int n = 0;
        long expected = 120;
        long actual = MathUtilyti.getFactorial(n);
       assertEquals(expected, actual);
        assertEquals(720, MathUtilyti.getFactorial(6));
        assertEquals(24, MathUtilyti.getFactorial(4));
        assertEquals(6, MathUtilyti.getFactorial(3));
        assertEquals(2, MathUtilyti.getFactorial(2));
        assertEquals(1, MathUtilyti.getFactorial(1));
        assertEquals(1, MathUtilyti.getFactorial(0));
//      Màu đỏ dẫn theo 2 nghĩa
//      Hàm tình đúng, kì vọng sai
//      Hàm tình sai, kì vọng đúng
//      Mỗi lời gọi hàm ở trên dc gọi là 1 test case
//      1 tình huống test ham2m, với 1 đầu vào và nhận 1 đầu ra
    }
//      test ngoại lệ thì test ntn?
//      vì khi ngoia5 lệ xảy ra, app dừng liền, màu đỏ, vì có điều ko ổn đã diễn ra
//      thêm nữa ngoại lệ ko phải là value để so sánh, ko biết nò là số mấy chuỗi gì
//      ngoại lệ thì có thể ước lượng nó, chạm nó khi nó xảy ra
//      test ngoại lệ nên dc diễn giải như sau:
//      đưa vào các tình huống dữ liệu cà chớn
//      t muốn nhìn xem ngoại lệ có xảy ra trong tình huống này
//      hay nó không, nếu có xảy ra, thì  mừng lắm luôn , vì app/hàm chậy đúng như thiết kế
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenRightArgumentThrowsException(){
        MathUtilyti.getFactorial(-5); //chạy hàm chưa test
        MathUtilyti.getFactorial(21); // biết hàm ném ngoại lệ
        MathUtilyti.getFactorial(-1); // ta phải chụp lại ngoại lệ
        MathUtilyti.getFactorial(40); // nếu có thật, hàm đúng
    }

}