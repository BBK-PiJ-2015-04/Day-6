public class ArrayCopier {
	
	public void copy(int[] src, int[] dst) {
		
		int shorterLength = 0;
		
		if(src.length > dst.length)
			shorterLength = dst.length;
		else
			shorterLength = dst.length;
		
		for(int i=0; i<shorterLength;i++)
		{
			dst[i]=src[i];
		}
		
		if(dst.length > src.length)
		{
			for(int i=shorterLength;i<dst.length;i++)
			{
				dst[i]=0;
			}
		}
				
	}
}
