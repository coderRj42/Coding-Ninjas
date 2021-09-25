public class solution {
public static void print(int n) {
int i,j,k=1,printer=1;
for(i=1;i<=n;i++)
{
for(j=1;j<=k;j++)
{
System.out.print(printer++);
if(printer==10)
printer=1;
}
k*=2;
System.out.println();
}
}
}
