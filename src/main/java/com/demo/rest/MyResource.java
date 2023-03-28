
package com.demo.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.BiPredicate;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.demo.rest.Outer.Inner;

/**
 * Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {

	/**
	 * Method processing HTTP GET requests, producing "text/plain" MIME media type.
	 * 
	 * @return String that will be send back as a response of type "text/plain".
	 */
	@GET
	@Produces("text/plain")
	public String getIt() {
		return "Hi there!";
	}
	/*
	 * @Path("/hello")
	 * 
	 * public class Hello
	 * 
	 * {
	 */

	@GET

	@Path("/welcome")

	@Produces(MediaType.TEXT_HTML)

	public String method()

	{

		return "<center><h1><font color=red size=50>Welcome To REST</font></h1></center>";

	}

	@GET

	@Path("/table/{num}")

	@Produces("text/html")

	public String mathTable(@PathParam("num") int a)

	{

		String result = "";

		for (int i = 1; i <= 10; i++)

		{

			result += a + " * " + i + " = " + a * i + "<br>";

		}

		return result;

	}

	@GET
	@Path("/E/{q}")
	@Produces(MediaType.TEXT_PLAIN)
	public String Vowel(@PathParam("q") String i) {
		return i.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o", "O").replaceAll("u",
				"U");
	}

	@GET

	@Path("/check/{str}")

	@Produces(MediaType.TEXT_PLAIN)

	public String checkOvelAndConsSum(@PathParam("str") String str)

	{

		Count c = new Count();

		return c.CheckOvlConSum(str);

	}

	@GET
	@Path("/square/{b}")
	@Produces(MediaType.TEXT_PLAIN)
	public String Square(@PathParam("b") int k) {
		Square s = new Square();
		s.x = k;
		return "Square of number " + k + " is " + s.getSquare();
	}

	@GET
	@Path("/longest/{string}")
	@Produces(MediaType.TEXT_PLAIN)
	public String task2(@PathParam("string") String str) {
		LongestWord aobj = new LongestWord();
		aobj.s1 = str;
		String result = aobj.longestWord();
		return result;
	}

	@GET
	@Path("/display/{array}")
	@Produces(MediaType.TEXT_PLAIN)
	public String Display(@PathParam("array") int k) {
		Display d = new Display();

		return d.display(k);

	}

	@GET
	@Path("/variable/{v}")
	@Produces(MediaType.TEXT_PLAIN)
	public int variable(@PathParam("v") String k) {
		String[] str = k.split(",");
		Variable v = new Variable();
		return v.add(str);
	}

	@GET
	@Path("name")
	@Produces(MediaType.TEXT_HTML)
	public String getInput(@Context HttpServletRequest rq) {
		String s = rq.getParameter("username");
		return "Hello " + s + "!!!";
	}

	@GET
	@Path("/compare/{x},{y}")
	@Produces(MediaType.TEXT_PLAIN)
	public String Compare(@PathParam("x") String s1, @PathParam("y") String s2) {
		/*
		 * if(s1.equals(s2)) { return "true"; } else { return "false"; }
		 */
		String str1 = s1;
		String str2 = new String(s2);
		return s1.equals(s2) + "";
	}

	/*
	 * @GET
	 * 
	 * @Path("/salary/{x},{y},{z}")
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String salary(@PathParam("x") int
	 * x, @PathParam("y") String y, @PathParam("z") double z) { Emp e=new Emp();
	 * e.id= x; e.name=y; e.salary=z; return e.annualSalary(); }
	 */

	@GET
	@Path("/order/{x}")
	@Produces(MediaType.TEXT_PLAIN)
	public String order(@PathParam("x") String x) {
		Alphabetical a = new Alphabetical();
		return a.alphabetical(x);
	}

	@GET
	@Path("/total/{x}")
	@Produces(MediaType.TEXT_PLAIN)
	public String total(@PathParam("x") String x) {
		Total t = new Total();
		return t.total(x);
	}

	/*
	 * @GET
	 * 
	 * @Path("/type/{x}")
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String type(@PathParam("x") String x)
	 * { try { int i=Integer.parseInt(x); return "Integer"; } catch(Exception e) {
	 * try { float f=Float.parseFloat(x); return "float"; } catch(Exception e1) {
	 * return "String"; } } }
	 * 
	 * @GET
	 * 
	 * @Path("/same/{x}")
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String assign(@PathParam("x") int x) {
	 * Example e= new Example(); e.assign(x); return e.x+""; }
	 * 
	 * @GET
	 * 
	 * @Path("/encrypt/{x}")
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String encrypt(@PathParam("x") int x)
	 * { Encryption e= new Encryption();
	 * 
	 * }
	 */
	/*
	 * @GET
	 * 
	 * @Path("lambda/{n}") public String lambda(@PathParam("n") float n) { Arith
	 * square=(a)->{ return n*n+""; }; Arith cube=(a)->{ return n*n*n+""; }; Arith
	 * odd=(a)->{ if(a%2!=0) { return n+"odd"; } else { return "even"; } }; String
	 * sq=square.findIt(n); return sq+"";
	 * 
	 * }
	 */
	@GET
	@Path("replace/{x},{y}")
	public String replace(@PathParam("x") String x, @PathParam("y") String y) {
		Replace r = new Replace();
		return r.replace(x, y);

	}

	@GET
	@Path("notrepeat/{x}")
	public String notRepeat(@PathParam("x") String x) {
		NotRepeat not = new NotRepeat();
		return not.notRepeat(x);
	}

	@GET
	@Path("middlechar/{x}")
	public String middlechar(@PathParam("x") String x) {
		Middlechar m = new Middlechar();
		return m.middlechar(x);
	}

	@GET
	@Path("comp/{x}/{y}")

	public String compare(@PathParam("x") int x, @PathParam("y") int y) {
		Compare bigger = (a, b) -> {
			if (a > b) {
				return " True First Value is Bigger";
			} else {

				return "false";
			}
		};
		Compare smaller = (a, b) -> {
			if (a < b) {
				return "True Second Value is Bigger";
			} else {

				return "false";
			}
		};
		Compare equals = (a, b) -> {
			if (a == b) {
				return "A is equals";
			} else {
				return "false";
			}
		};
		String b = bigger.compare(x, y);
		String s = smaller.compare(x, y);
		String e = equals.compare(x, y);
		return b + "," + s + "," + e;

	}

	@GET
	@Path("/inner")
	@Produces(MediaType.TEXT_PLAIN)
	public String inner() {
		Inner in = new Inner();
		return in.x + "";
	}

	@GET
	@Path("check")

	public String var() {
		Encryption e = new Encryption();
		return e.some();
	}

	@GET
	@Produces("text/plain")
	@Path("array/{x},{y}")
	public String array(@PathParam("x") int a, @PathParam("y") int n) {
		Array array = new Array();
		array.createArray(n);
		for (int i = 0; i < n; i++)
			array.addValue(a * (i + 1), i);
		return array.readArray();
	}

	@GET
	@Path("bonus")
	@Produces(MediaType.TEXT_HTML)
	public String totalSalary() {
		int[] ids = { 101, 102, 103, 104 };
		String[] names = { "sai", "teja", "durga", "bheem" };
		double[] sals = { 10000, 20000, 30000, 40000 };

		String res = "";
		Salary s[] = new Salary[4];

		for (int i = 0; i < s.length; i++) {
			s[i] = new Salary(ids[i], names[i], sals[i]);
			s[i].bonus = 0.15 * s[i].sal;
			s[i].total = s[i].bonus + s[i].sal;

		}
		for (Salary t : s)
			res += t.toString();
		return res;
	}

	@GET
	@Path("package")
	public String expSalary() {
		int[] ids = { 101, 102, 103, 104 };
		String[] names = { "susumita", "lavanya", "vandana", "ankita" };
		int[] skills = { 1, 2, 3, 4 };
		int[] exps = { 1, 2, 3, 4 };
		Experience e[] = new Experience[4];
		for (int i = 0; i < e.length; i++) {
			e[i] = new Experience(ids[i], names[i], skills[i], exps[i]);
			e[i].salary = e[i].skill * 1000 + e[i].exp * 10000;
		}
		String res = "";
		for (Experience ex : e)
			res += ex.toString() + "<br>";
		return res;
	}

	@GET
	@Path("room/{r}")
	public String company(@PathParam("r") String ro) {
		try {
			Room room = Room.valueOf(ro.toUpperCase());
			String msg = "";
			switch (room) {
			case TRAINING_ROOM:
				Room r = Room.TRAINING_ROOM;

				msg = "Learn Thoroughly" + "<br>" + r.actions + "<br>" + r.chairs;
				break;
			case PANTRY:
				Room s = Room.PANTRY;
				msg = "Don't waste Food" + "<br>" + s.actions + "<br>" + s.chairs;
				break;
			case CONFERENCE_ROOM:
				Room t = Room.CONFERENCE_ROOM;
				msg = "Keep quiet" + "<br>" + t.actions + "<br>" + t.chairs;
				break;
			case MANAGER_ROOM:
				Room m = Room.MANAGER_ROOM;
				msg = "Update the Status" + "<br>" + m.actions + "<br>" + m.chairs;
				break;

			}

			return msg;
		} catch (Exception e) {
			return "Please enter valid room name";
		}

	}

	@GET
	@Path("load_data/{name}")
	public String loadData(@PathParam("name") String fileName) throws Exception {
		FileOp op = new FileOp();
		return op.loadData(fileName);
	}

	@GET
	@Path("read_data/{name}")
	public String readData(@PathParam("name") String fileName) throws Exception {
		FileOp op = new FileOp();
		return op.readData(fileName);
	}

	@GET
	@Path("compress")
	public String compress() throws Exception {
		FileOp op = new FileOp();
		return op.compress();
	}

	@GET
	@Path("decompress")
	public String decompress() throws Exception {
		FileOp op = new FileOp();
		return op.decompress();
	}

	@GET
	@Path("serialize")
	public String serialize() throws Exception {
		Student s = new Student();
		return s.serialisation();
	}

	@GET
	@Path("deserialize")
	public String deserialize() throws Exception {
		Student s = new Student();
		return s.deserialisation();
	}

	@GET
	@Path("read_line/{n}")
	public String readLine(@PathParam("n") int n) throws Exception {
		FileOp f = new FileOp();
		return f.readline(n);
	}

	@GET
	@Path("readarray")
	public String array() throws Exception {
		FileOp f = new FileOp();
		return f.arraydisplay();
	}

	@GET
	@Path("rename/{f1},{f2}")
	public String rename(@PathParam("f1") String fname1, @PathParam("f2") String fname2) {
		File f1 = new File("c:/b4/" + fname1 + ".txt");
		File f2 = new File("c:/b4/" + fname2 + ".txt");
		f1.renameTo(f2);
		return "File Renamed";
	}

	@GET
	@Path("copypaste")
	public String copyPaste() throws Exception {
		File f1 = new File("c:/b4/read.txt");
		File f2 = new File("c:/b4/write/" + f1.getName());
		FileInputStream fin = new FileInputStream(f1);
		FileOutputStream fout = new FileOutputStream(f2);
		int ch = fin.read();
		while (ch != -1) {
			fout.write(ch);
			ch = fin.read();
		}
		return "copied";
	}
	
	@GET
	 @Path("cutpaste")
	public String cutPaste() throws Exception
	{
		File f1=new File("c:/b4/hello/read.txt");
		File f2=new File("c:/b4/hii/"+f1.getName());
		FileInputStream fin= new FileInputStream(f1);
		FileOutputStream fout= new FileOutputStream(f2);
		int ch=fin.read();
		while(ch!=-1) 
		{
			fout.write(ch);
			ch=fin.read();
		}
		fin.close();
		f1.delete();
		return "Done";
	}
}
