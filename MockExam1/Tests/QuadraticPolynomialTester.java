import static org.junit.Assert.*;

import org.junit.Test;
public class QuadraticPolynomialTester {
	
    @Test
    public void constructorTest1 () {
    	
        QuadraticPolynomial p1 = new QuadraticPolynomial(1.0, 2.0, 3.0);
        assertNotNull("Problem creating new QuadraticPolynomial", p1);

         QuadraticPolynomial p2 = new QuadraticPolynomial(-4.0, 0, 1/3);
         assertNotNull("Problem creating new QuadraticPolynomial", p2);

    }
    
    @Test
    public void gettersTest () {
    	
    	//Assumes constructor works
    	
        QuadraticPolynomial p = new QuadraticPolynomial(1.0, 2.0, 3.0);
        assertEquals("Wrong quadratic coefficient", 1.0, p.getA(), 1e-10);
        assertEquals("Wrong linear coefficient", 2.0, p.getB(), 1e-10);
        assertEquals("Wrong constant coefficient", 3.0, p.getC(), 1e-10);

         QuadraticPolynomial q = new QuadraticPolynomial(-3.0, 3.0, 9.0);
         assertEquals("Wrong quadratic coefficient", -3.0, q.getA(), 1e-10);
         assertEquals("Wrong linear coefficient", 3.0, q.getB(), 1e-10);
         assertEquals("Wrong constant coefficient", 9.0, q.getC(), 1e-10);
         
    }
    
    @Test
    public void settersTest () {
    	
    	// Assumes getters work
    	
        QuadraticPolynomial p = new QuadraticPolynomial(1.0, 2.0, 3.0);
        p.setA(p.getA()+1.0);
        p.setB(p.getB()*3.0);
        p.setC(p.getC()/3.0);
        assertEquals("Wrong quadratic coefficient", 2.0, p.getA(), 1e-10);
        assertEquals("Wrong linear coefficient", 6.0, p.getB(), 1e-10);
        assertEquals("Wrong constant coefficient", 1.0, p.getC(), 1e-10);

         QuadraticPolynomial q = new QuadraticPolynomial(3.0, 3.0, 9.0);
         q.setA(q.getA()+1.0);
         q.setB(0);
         q.setC(q.getC()/3.0);
         assertEquals("Wrong quadratic coefficient", 4.0, q.getA(), 1e-10);
         assertEquals("Wrong linear coefficient", 0, q.getB(), 1e-10);
         assertEquals("Wrong constant coefficient", 3.0, q.getC(), 1e-10);
    }
    
    @Test
	public void constructorTest2 () {
		
		QuadraticPolynomial p1 = new QuadraticPolynomial(0);
		assertEquals("Wrong quadratic coefficient", 0, p1.getA(), 1e-10);
		assertEquals("Wrong linear coefficient", 0, p1.getB(), 1e-10);
		assertEquals("Wrong constant coefficient", 0, p1.getC(), 1e-10);
		
		QuadraticPolynomial p2 = new QuadraticPolynomial(1.0);
		assertEquals("Wrong quadratic coefficient", 1.0, p2.getA(), 1e-10);
		assertEquals("Wrong linear coefficient", 1.0, p2.getB(), 1e-10);
		assertEquals("Wrong constant coefficient", 1.0, p2.getC(), 1e-10);
		
		QuadraticPolynomial p3 = new QuadraticPolynomial(2.0);
		assertEquals("Wrong quadratic coefficient", 2.0, p3.getA(), 1e-10);
		assertEquals("Wrong linear coefficient", 2.0, p3.getB(), 1e-10);
		assertEquals("Wrong constant coefficient", 2.0, p3.getC(), 1e-10);
		
		QuadraticPolynomial p4 = new QuadraticPolynomial(-3.0);
		assertEquals("Wrong quadratic coefficient", -3.0, p4.getA(), 1e-10);
		assertEquals("Wrong linear coefficient", -3.0, p4.getB(), 1e-10);
		assertEquals("Wrong constant coefficient", -3.0, p4.getC(), 1e-10);

	}
    
    @Test
	public void evalTest () {

		QuadraticPolynomial p = new QuadraticPolynomial(1.0, 1.0, 1.0);
		assertEquals("Wrong result in eval method" , 3.0, p.eval(1.0), 1e-10);
		assertEquals("Cannot modify target polynomial", 1.0,p.getA(), 1e-10);
		assertEquals("Cannot modify target polynomial", 1.0,p.getB(), 1e-10);
		assertEquals("Cannot modify target polynomial", 1.0,p.getC(), 1e-10);

		QuadraticPolynomial q = new QuadraticPolynomial(2.0, 2.0, 2.0);
		assertEquals("Wrong result in eval method" , 14.0, q.eval(2.0), 1e-10);
		assertEquals("Cannot modify target polynomial", 2.0,q.getA(), 1e-10);
		assertEquals("Cannot modify target polynomial", 2.0,q.getB(), 1e-10);
		assertEquals("Cannot modify target polynomial", 2.0,q.getC(), 1e-10);

		QuadraticPolynomial r = new QuadraticPolynomial(3.0, 2.0, 1.0);
		assertEquals("Wrong result in eval method" , 57, r.eval(4.0), 1e-10);
		assertEquals("Cannot modify target polynomial", 3.0,r.getA(), 1e-10);
		assertEquals("Cannot modify target polynomial", 2.0,r.getB(), 1e-10);
		assertEquals("Cannot modify target polynomial", 1.0,r.getC(), 1e-10);

	}
    
    @Test
	public void discriminantTest() {

		QuadraticPolynomial p = new QuadraticPolynomial(1.0, 4.0, 2.0);
		assertEquals("Wrong result in eval method" , 8.0, p.discriminant(), 1e-10);
		assertEquals("Cannot modify target polynomial", 1.0,p.getA(), 1e-10);
		assertEquals("Cannot modify target polynomial", 4.0,p.getB(), 1e-10);
		assertEquals("Cannot modify target polynomial", 2.0,p.getC(), 1e-10);

		QuadraticPolynomial q = new QuadraticPolynomial(1.0, 4.0, 4.0);
		assertEquals("Wrong result in eval method" , 0.0, q.discriminant(), 1e-10);
		assertEquals("Cannot modify target polynomial", 1.0,q.getA(), 1e-10);
		assertEquals("Cannot modify target polynomial", 4.0,q.getB(), 1e-10);
		assertEquals("Cannot modify target polynomial", 4.0,q.getC(), 1e-10);

		QuadraticPolynomial r = new QuadraticPolynomial(2.0, 4.0, -1/3.0);
		assertEquals("Wrong result in eval method" , 16+(8/3.0), r.discriminant(), 1e-10);
		assertEquals("Cannot modify target polynomial", 2.0,r.getA(), 1e-10);
		assertEquals("Cannot modify target polynomial", 4.0,r.getB(), 1e-10);
		assertEquals("Cannot modify target polynomial", -1/3.0,r.getC(), 1e-10);

	}
    
    @Test
    public void scaleTest() {
	  
            QuadraticPolynomial p = new QuadraticPolynomial(1.0, 2.0, 3.0);
	    	QuadraticPolynomial r = p.scale(2.0);
	    	assertNotSame("The returned object is not a new one",r, p);
	    	assertEquals("Wrong quadratic coefficient", 1.0, p.getA(), 1e-10);
	    	assertEquals("Wrong linear coefficient", 2.0, p.getB(), 1e-10);
	    	assertEquals("Wrong constant coefficient", 3.0, p.getC(), 1e-10);
	    	assertEquals("Wrong quadratic coefficient", 2.0, r.getA(), 1e-10);
	    	assertEquals("Wrong linear coefficient", 4.0, r.getB(), 1e-10);
	    	assertEquals("Wrong constant coefficient", 6.0, r.getC(), 1e-10);


	    	QuadraticPolynomial q = new QuadraticPolynomial(3.0, 2.0, 1.0);
	    	QuadraticPolynomial t = q.scale(2.0);
	    	assertNotSame("The returned object is not a new one",t, q);
	    	assertEquals("Wrong quadratic coefficient", 3.0, q.getA(), 1e-10);
	    	assertEquals("Wrong linear coefficient", 2.0, q.getB(), 1e-10);
	    	assertEquals("Wrong constant coefficient", 1.0, q.getC(), 1e-10);
	    	assertEquals("Wrong quadratic coefficient", 6.0, t.getA(), 1e-10);
	    	assertEquals("Wrong linear coefficient", 4.0, t.getB(), 1e-10);
	    	assertEquals("Wrong constant coefficient", 2.0, t.getC(), 1e-10);


	    	QuadraticPolynomial s = new QuadraticPolynomial(3.0, 2.0, 1.0);
	    	QuadraticPolynomial u = s.scale(0);
	    	assertNotSame("The returned object is not a new one",u, s);
	    	assertEquals("Wrong quadratic coefficient", 3.0, s.getA(), 1e-10);
	    	assertEquals("Wrong linear coefficient", 2.0, s.getB(), 1e-10);
	    	assertEquals("Wrong constant coefficient", 1.0, s.getC(), 1e-10);
	    	assertEquals("Wrong quadratic coefficient", 0, u.getA(), 1e-10);
	    	assertEquals("Wrong linear coefficient", 0, u.getB(), 1e-10);
	    	assertEquals("Wrong constant coefficient",0,u.getC(), 1e-10);

    }
    
    @Test
	public void addTestReturnIsNew() {
		QuadraticPolynomial p = new QuadraticPolynomial(1.0, 2.0, 3.0);
		QuadraticPolynomial q = new QuadraticPolynomial(3.0, 2.0, 1.0);
		QuadraticPolynomial r = p.add(q);
		assertNotSame("The returned object is not a new one",r, q);

		QuadraticPolynomial s = q.add(r);
		assertNotSame("The returned object is not a new one",s, r);

	}
	
	@Test
	public void addTestReturnHasRightCoeffs() {
		QuadraticPolynomial p = new QuadraticPolynomial(1.0, 2.0, 3.0);
		QuadraticPolynomial q = new QuadraticPolynomial(3.0, 2.0, 1.0);
		QuadraticPolynomial r = p.add(q);
		assertEquals("Wrong quadratic coefficient", 4.0, r.getA(), 1e-10);
		assertEquals("Wrong linear coefficient", 4.0, r.getB(), 1e-10);
		assertEquals("Wrong constant coefficient", 4.0, r.getC(), 1e-10);

		QuadraticPolynomial s = q.add(r);
		assertEquals("Wrong quadratic coefficient", 7.0, s.getA(), 1e-10);
		assertEquals("Wrong linear coefficient", 6.0,s.getB(), 1e-10);
		assertEquals("Wrong constant coefficient", 5.0,s.getC(), 1e-10);

	}
	
	@Test
	public void addTestDoesNotModifyTarget() {
		QuadraticPolynomial p = new QuadraticPolynomial(1.0, 2.0, 3.0);
		QuadraticPolynomial q = new QuadraticPolynomial(3.0, 2.0, 1.0);
		QuadraticPolynomial r = p.add(q);
		assertEquals("Cannot modify target polynomial", 1.0,p.getA(), 1e-10);
		assertEquals("Cannot modify target polynomial", 2.0,p.getB(), 1e-10);
		assertEquals("Cannot modify target polynomial", 3.0,p.getC(), 1e-10);


		QuadraticPolynomial s = q.add(r);
		assertEquals("Cannot modify target polynomial", 3.0,q.getA(), 1e-10);
		assertEquals("Cannot modify target polynomial", 2.0,q.getB(), 1e-10);
		assertEquals("Cannot modify target polynomial", 1.0,q.getC(), 1e-10);

	}
	
	@Test
	public void addTestDoesNotModifyArgument() {
		QuadraticPolynomial p = new QuadraticPolynomial(1.0, 2.0, 3.0);
		QuadraticPolynomial q = new QuadraticPolynomial(3.0, 2.0, 1.0);
		QuadraticPolynomial r = p.add(q);
		assertEquals("Cannot modify argument polynomial", 3.0,q.getA(), 1e-10);
		assertEquals("Cannot modify argument polynomial", 2.0,q.getB(), 1e-10);
		assertEquals("Cannot modify argument polynomial", 1.0,q.getC(), 1e-10);

		QuadraticPolynomial s = q.add(r);
		assertEquals("Cannot modify argument polynomial", 4.0,r.getA(), 1e-10);
		assertEquals("Cannot modify argument polynomial", 4.0,r.getB(), 1e-10);
		assertEquals("Cannot modify argument polynomial", 4.0,r.getC(), 1e-10);
	}
}