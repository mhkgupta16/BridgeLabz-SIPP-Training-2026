public class UglyNumber {
   public UglyNumber() {
   }

   public boolean isUgly(int var1) {
      if (var1 < 0) {
         return false;
      } else {
         while(var1 > 1) {
            if (var1 % 2 == 0) {
               var1 /= 2;
            } else if (var1 % 3 == 0) {
               var1 /= 3;
            } else {
               if (var1 % 5 != 0) {
                  return false;
               }

               var1 /= 5;
            }
         }

         return true;
      }
   }
}

