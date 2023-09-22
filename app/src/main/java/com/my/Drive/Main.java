//تم تطوير المكتبه من شخص واحد هو مصطفى وسام
//The library was developed by one person, Mustafa Wessam.
//Please assist the developer and improve the library.
//The library was developed for Android applications only.
package com.my.Drive;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Vibrator;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.startapp.sdk.*;
import com.unity3d.ads.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.LineNumberReader;
import com.startapp.sdk.adsbase.adlisteners.*;
import com.startapp.sdk.adsbase.*;
import com.startapp.sdk.ads.banner.*;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.IUnityBannerListener;
import com.unity3d.services.banners.UnityBanners;
import android.view.ViewGroup;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import android.view.ViewGroup.LayoutParams;
import java.util.stream.Collectors;
import java.lang.reflect.Method;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import com.unity3d.services.core.misc.Utilities;
import android.view.WindowManager;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

//تم تطوير المكتبه من شخص واحد هو مصطفى وسام
//The library was developed by one person, Mustafa Wessam.
//Please assist the developer and improve the library.
//The library was developed for Android applications only.

public class Main {
 private  static FirebaseDatabase _firebase;
	private static Timer _timer = new Timer();
	
	private static String line1 = "";
	private static double error = 0;
	private static String stop = "";
	private static String toast = "";
	private static String copyfilestring = "";
	private static String createString = "";
	private static String pkgapp = "";
	private static String stoperror = "";
	private static String newstring = "";
	private static String toastfil = "";
	private static String deleteline = "";
	private static String linestring = "";
	private static String PackageData = "";
	private static String fname = "";
	private static String savePath = "";
	private static String MASSEGE = "";
	private static String TEXT_COLOR = "";
	private static String BG_COLOR = "";
	private static String BORDER_COLOR = "";
	private static String AddFileString = "";
	private static String StopLine = "";
	private static String Stringfile = "";
	private static double AddFileont = 0;
	private static String file = "";
	private static String file1 = "";
	private static String file2 = "";
	private static String file3 = "";
	private static String file4 = "";
	private static String editfile = "";
	private static String addfie = "";
	private static String edit = "";
	private static String ed = "";
	private static String filee = "";
	private static String edvi = "";
	private static String edvi2 = "";
	private static String Dialogs = "";
	private static String title = "";
	private static String message = "";
	private static double timee = 0;
	private static String cancelable1 = "";
	private static String TorchModeck = "";
	private static boolean elset = false;
	private static String mif = "";
	private static String Stringck = "";
	private static String TelegramBot = "";
	private static String tokenbot = "";
	private static String messagebot = "";
	private static String groupuser = "";
	private static HashMap<String, Object> chatgptmap = new HashMap<>();
	private static HashMap<String, Object> chatgptmap2 = new HashMap<>();
	private static HashMap<String, Object> firebasedrive = new HashMap<>();	
	private static String ChatGpt = "";
	private static String erorno = "";
	private static String addif = "";
	private static String button1st = "";
	private static String button2st = "";
	private static String button3st = "";
	private static String button = "";
	private static String s = "";
	private static String getno = "";
	private static String nu = "";
	private static String OnClick = "";
	private static String OnClick2 = "";
	private static String OnClick3 = "";
	private static String lineck = "";
	private static String saveline = "";
	private static String ck = "";
	private static String eroor = "";
	private static String dl = "";
	private static String fg = "";
	private static double inte = 0;
	private static String f = "";
	private static double intview = 0;
	private static String stru = "";
	private static String no = "";
	private static double in = 0;
	private static double in1 = 0;
	private static double in2 = 0;
	private static double in3 = 0;
	private static double in4 = 0;
	private static String onclick = "";
	private static  String cks = "";
	private static String cke = "";
	private static String randomString = "";
	private static String re2 = "";
	private static double rendm2 = 0;
	private static String Time2f = "";
	private static double cke3 = 0;
	private static double cke4 = 0;
	private static double df = 0;
	private static double dlo = 0;
	private static String a = "";
	private static String mpt = "";
	private static DatabaseReference drivefier;
	private static ChildEventListener _drivefier_child_listener;
	private static SharedPreferences save2;
		public static Activity m;
		public static Class<?> cl;
	    public static String pa="";
		public static String emor;
	private static ArrayList<String> myList = new ArrayList<>();
	private static ArrayList<String> myList2 = new ArrayList<>();
	private static ArrayList<String> myList3 = new ArrayList<>();
	private static ArrayList<String> myList4 = new ArrayList<>();
	private static ArrayList<String> butline = new ArrayList<>();
	private static ArrayList<String> butline1 = new ArrayList<>();
	private static ArrayList<String> butline2 = new ArrayList<>();
	private static ArrayList<String> line = new ArrayList<>();
	private static ArrayList<Double> n = new ArrayList<>();	
private static List<View> textViewsList = new ArrayList<>();
private static List<View> textline = new ArrayList<>();
private static List<TextView> textv = new ArrayList<>();
private static List<Button> textv1 = new ArrayList<>();
private static List<EditText> textv2 = new ArrayList<>();
private static List<LinearLayout> textv3 = new ArrayList<>();
private static List<WindowManager> textv4 = new ArrayList<>();	
private static List<LinearLayout> winview = new ArrayList<>();	
private static List<WindowManager.LayoutParams> win3 = new ArrayList<>();	
	private static AlertDialog.Builder d;
	private static TimerTask time;
	private static Vibrator vibrate2;
	private static RequestNetwork req;
	private static RequestNetwork.RequestListener _req_request_listener;
	private static Intent intent = new Intent();
	private static RequestNetwork reqt;
	private static RequestNetwork.RequestListener _reqt_request_listener;
	private static TimerTask edittext;
	private static LinearLayout.LayoutParams layoutParams;
	private static  List<AlertDialog.Builder> dlog0 = new ArrayList<>();
private static AlertDialog alertDialog;
 
public static void sm(Activity m){


	if (Build.VERSION.SDK_INT >= 23) {
			if (m.checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
				||m.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
				m.requestPermissions(new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
			} else {
				
			}
		} else {
			
		}
}
	 
              public static void main(Activity main2){
				  m = main2;
            		start();
				
			}
	public static void start(){
	d = new AlertDialog.Builder(m);
	vibrate2 = (Vibrator) m.getSystemService(Context.VIBRATOR_SERVICE);
	save2 = m.getSharedPreferences("SaveDrive", Activity.MODE_PRIVATE);
                pkgapp = FileUtil.getPackageDataDir(m).replace("/files", "");
				pkgapp = Uri.parse(pkgapp).getLastPathSegment();
				StopLine = "";
				Stringfile = "";
				AddFileont = 0;
				toast = "";
				toastfil = "";
				Dialogs = "";
				message = "";
				title = "";
				stoperror = "";
				s = "";
				elset = false;
				dl = "hffj";
				inte = 0;
				intview = 0;
				in = 0;
				in1 = 0;
				in2 = 0;
				in3 = 0;
				in4 = 0;
				no = "";	
				dlo =0;			
				del(pkgapp);
				try {
					
					// عرض جميع العناصر باستخدام حلقة for
					for (int i = 0; i < myList.size(); i++) {
						    String item = myList.get(i);
						
						int resourceId = m.getResources().getIdentifier(item, "id", m.getPackageName());
															ViewGroup view = m.findViewById(resourceId);
						
						for (View textView : textViewsList) {
							 view.removeView(textView); 
							 }
					}
					for (int i = 0; i < winview.size(); i++) {
					LinearLayout te=winview.get(i);
					te.removeAllViews();
					}					
					myList.clear();
					textViewsList.clear();
					textline.clear();
					line.clear();
					textv.clear();
					textv1.clear();
					textv2.clear();
					textv3.clear();
					textv4.clear();
					win3.clear();
					winview.clear();
					dlog0.clear();
				} catch (Exception e) {
					myList.clear();
					textViewsList.clear();
					textline.clear();
					line.clear();
					textv.clear();
					textv1.clear();
					textv2.clear();
					textv3.clear();
					textv4.clear();
					win3.clear();
					winview.clear();
					dlog0.clear();
				}
		try{
			req = new RequestNetwork(m);
			_req_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		reqt = new RequestNetwork(m);
		_reqt_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				try {
					if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/")).concat(ChatGpt.concat("/".concat(ChatGpt).concat("chatgptSuccess"))))) {
						try {
									
							StopLine = "";
							Stringfile = "";
							AddFileont = 0;
							toast = "";
							toastfil = "";
							message = "";
							title = "";
							stop = "";
							FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/String/")));
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("ChatSuccess()"))), ((new JSONObject(_response)).getJSONArray("choices").getJSONObject(0).getString("text")).replaceAll("(?m)^[\t]*\\r?\n", ""));
							lineCounter("/data/user/0/".concat(pkgapp.concat("/chatgpt/")).concat(ChatGpt.concat("/".concat(ChatGpt).concat("chatgptSuccess"))));
									} catch(Exception e) {
										
								}
					}
				} catch (Exception e) {
					 
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
         if (emor.equals("")){
				
			}else{
				if (FileUtil.isFile(emor)) {
					FileUtil.writeFile(FileUtil.getPackageDataDir(m).concat("/main.dr"),FileUtil.readFile(emor));
					stop = "";
					lineCounter(FileUtil.getPackageDataDir(m).concat("/main.dr"));
					
									
				} else if (emor.equals("MainData")){
				
				FileUtil.writeFile(FileUtil.getPackageDataDir(m).concat("/main.dr"),FileUtil.readFile(FileUtil.getPackageDataDir(m).concat("/MainData")));
			stop = "";
			lineCounter(FileUtil.getPackageDataDir(m).concat("/main.dr"));
				}
				else if (FileUtil.isFile(FileUtil.getPackageDataDir(m).concat("/".concat(emor)))){
			FileUtil.writeFile(FileUtil.getPackageDataDir(m).concat("/main.dr"),FileUtil.readFile(FileUtil.getPackageDataDir(m).concat("/".concat(emor))));
			stop = "";
			lineCounter(FileUtil.getPackageDataDir(m).concat("/main.dr"));	
				
				}
				else {			
			FileUtil.writeFile(FileUtil.getPackageDataDir(m).concat("/main.dr"),emor);
			stop = "";
			lineCounter(FileUtil.getPackageDataDir(m).concat("/main.dr"));
			}
			}
		} catch(Exception e) {

		}
	}	

public static void del(String pkg){
pkgapp = pkg;
FileUtil.deleteFile(FileUtil.getPackageDataDir(m).concat("/main.dr")); 	
FileUtil.deleteFile("/data/user/0/".concat(pkgapp.concat("/String")));
				FileUtil.deleteFile("/data/user/0/".concat(pkgapp.concat("/Dialog")));
				FileUtil.deleteFile("/data/user/0/".concat(pkgapp.concat("/time")));
				FileUtil.deleteFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot")));
				FileUtil.deleteFile("/data/user/0/".concat(pkgapp.concat("/Intent")));
				FileUtil.deleteFile("/data/user/0/".concat(pkgapp.concat("/chatgpt")));
				FileUtil.deleteFile("/data/user/0/".concat(pkgapp.concat("/public")));
				FileUtil.deleteFile("/data/user/0/".concat(pkgapp.concat("/ButtonOnClick")));
				FileUtil.deleteFile("/data/user/0/".concat(pkgapp.concat("/int")));
				FileUtil.deleteFile("/data/user/0/".concat(pkgapp.concat("/View")));
				FileUtil.deleteFile("/data/user/0/".concat(pkgapp.concat("/ViewAll")));
				FileUtil.deleteFile("/data/user/0/".concat(pkgapp.concat("/Time")));
				FileUtil.deleteFile("/data/user/0/".concat(pkgapp.concat("/WindowManager")));
				FileUtil.deleteFile("/data/user/0/".concat(pkgapp.concat("/firebase")));
}

public static void del2(String pkg){
pkgapp = pkg;
FileUtil.deleteFile(FileUtil.getPackageDataDir(m).concat("/main.dr")); 	
}


	public static void _print() {
		if (saveline.contains("print")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace("print", "+");
			ck = ":".concat(ck);			
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("print", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (StopLine.equals("")) {
										SketchwareUtil.showMessage(m, m3.group());
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										SketchwareUtil.showMessage(m, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
									}
								}
								else {
									_erorr2("print", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("print", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("print", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("print", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("print", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _Drive() {
	}
	public static void lineCounter (String path) throws IOException {
		
		         int lineCount = 0, commentsCount = 0;
		
		        Scanner input = new Scanner(new File(path));
		        while (input.hasNextLine()) {
			            String data1 = input.nextLine();
			
			line1 =data1;
			saveline = line1;
			                  
			lineCount++;
			error =lineCount;
			pkgapp = FileUtil.getPackageDataDir(m).replace("/files", "");
			pkgapp = Uri.parse(pkgapp).getLastPathSegment();
			PackageData = "/data/user/0/".concat(pkgapp.concat("/"));
			if (!s.equals("")) {
				s = "";
			}
			stoperror = "";
			if (toast.equals("")) {
				toastfil = "";
			}
			else {
				toastfil = "\n";
			}
			try {
				if (StopLine.equals("1")) {
					if (saveline.contains("}")) {
						if ((AddFileont > 1) || (AddFileont == 1)) {
							Stringfile = Stringfile.concat("\n".concat(line1));
							AddFileont--;
						}
						else {
							FileUtil.writeFile(AddFileString, Stringfile);
							StopLine = "";
							Stringfile = "";
							AddFileont = 0;
						}
					}
					else {
						Stringfile = Stringfile.concat("\n".concat(line1));
						if (saveline.contains("{")) {
							AddFileont++;
						}
						else {
							
						}
					}
				}
				else {
					if (StopLine.equals("2")) {
						if (saveline.contains("}")) {
							if ((AddFileont > 1) || (AddFileont == 1)) {
								Stringfile = Stringfile.concat("\n".concat(line1));
								AddFileont--;
							}
							else {
								AddFileont = 0;
								FileUtil.writeFile(AddFileString, Stringfile);
								StopLine = "";
								Stringfile = "";
							}
						}
						else {
							Stringfile = Stringfile.concat("\n".concat(line1));
							if (saveline.contains("{")) {
								AddFileont++;
							}
							else {
								
							}
						}
					}
					else {
							if (StopLine.equals("3")) {
							if (saveline.contains("}")) {
								if ((AddFileont > 1) || (AddFileont == 1)) {
									Stringfile = Stringfile.concat("\n".concat(line1));
									AddFileont--;
								}
								else {
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Time/".concat(Time2f))), Stringfile);
									StopLine = "";
									Stringfile = "";
									AddFileont = 0;
									timee = Integer.parseInt(AddFileString);
									final int t= (int) timee;
									final String m1=Time2f;
									time = new TimerTask() {
										@Override
										public void run() {
											m.runOnUiThread(new Runnable() {
												@Override
												public void run() {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Time/".concat(m1))))) {
														_imports("/data/user/0/".concat(pkgapp.concat("/Time/".concat(m1))));
													}
												}
											});
										}
									};
									_timer.scheduleAtFixedRate(time, (int)(0), (int)(t));
								}
							}
							else {
								Stringfile = Stringfile.concat("\n".concat(line1));
								if (saveline.contains("{")) {
									AddFileont++;
								}
								else {
									
								}
							}
						}
						else {
							if (StopLine.equals("7")) {
								if (saveline.contains("}")) {
									if ((AddFileont > 1) || (AddFileont == 1)) {
										Stringfile = Stringfile.concat("\n".concat(line1));
										AddFileont--;
									}
									else {
										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Time/".concat(Time2f))), Stringfile);
										StopLine = "";
										Stringfile = "";
										AddFileont = 0;
										timee = Integer.parseInt(AddFileString);
										final int t= (int) timee;
										final String m1=Time2f;
										time = new TimerTask() {
											@Override
											public void run() {
												m.runOnUiThread(new Runnable() {
													@Override
													public void run() {
														if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Time/".concat(m1))))) {
															_imports("/data/user/0/".concat(pkgapp.concat("/Time/".concat(m1))));
														}
													}
												});
											}
										};
										_timer.schedule(time, (int)(t));
									}
								}
								else {
									Stringfile = Stringfile.concat("\n".concat(line1));
									if (saveline.contains("{")) {
										AddFileont++;
									}
									else {
										
									}
								}
							}
							else {
								if (StopLine.equals("4")) {
									if (saveline.contains("}")) {
										if ((AddFileont > 1) || (AddFileont == 1)) {
											AddFileont--;
										}
										else {
											StopLine = "";
											Stringfile = "";
											AddFileont = 0;
											elset = false;
										}
									}
									else {
										if (saveline.contains("{")) {
											AddFileont++;
										}
										else {
											
										}
									}
								}
								else {
									if (StopLine.equals("5")) {
										if (saveline.contains("}")) {
											if ((AddFileont > 1) || (AddFileont == 1)) {
												Stringfile = Stringfile.concat("\n".concat(line1));
												AddFileont--;
											}
											else {
												AddFileont = 0;
												OnClick = Stringfile;
												FileUtil.writeFile(OnClick2, OnClick);
												StopLine = "";
												Stringfile = "";
												int resourceId = m.getResources().getIdentifier(OnClick3, "id", m.getPackageName());
												View view = m.findViewById(resourceId);
												final String te=OnClick2;
												view.setOnClickListener(new View.OnClickListener() {
													@Override
													public void onClick(View _view) {
														_imports(te);
													}
												});
											}
										}
										else {
											Stringfile = Stringfile.concat("\n".concat(line1));
											if (saveline.contains("{")) {
												AddFileont++;
											}
											else {
												
											}
										}
									}
									else {
										if (StopLine.equals("6")) {
											if (saveline.contains("}")) {
												if ((AddFileont > 1) || (AddFileont == 1)) {
													Stringfile = Stringfile.concat("\n".concat(line1));
													AddFileont--;
												}
												else {
													AddFileont = 0;
													OnClick = Stringfile;
													FileUtil.writeFile(OnClick2, OnClick);
													StopLine = "";
													Stringfile = "";
													Dialogs = onclick;
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
														cks = "setClick";
														cke = OnClick2;
														_text();
													}
													else {
														_erorr2("onClick", error, "حدث خطاء الرجاء تحقق من صحت الكود");
													}
												}
											}
											else {
												Stringfile = Stringfile.concat("\n".concat(line1));
												if (saveline.contains("{")) {
													AddFileont++;
												}
												else {
													
												}
											}
										}
										else {
											
										}
									}
								}
							}
						}
					}
				}
				if (stop.equals("")) {
					_IntToString();
					_StringtoInt();
					_print();
					_delete();
					_string();
					_copyfile();
					_copydir();
					_publk();
					_redfile();
					_EditFile();
					_Dialog();
					_importDrive();
					_Time();
					_vibrate();
					_TorchMode();
					_starapp();
					_ifck();
					_Host();
					_isFile();
					_unity();
					_telegrambot();
					_UnityvedeoAds();
					_IntentWeb();
					_DIntent();
					_chatgpt();
					_publicdrive();
					_intcr();
					_TextViewcr();
					_EditText2();
					_Button2();
					_LinearLayout2();
					_view();
					_getText();
					_azre();
					_intrandm();
					_getputExtra();
					_reeditstring();
					_save();
					_getData();
					_rmove();
					_mintm();
					_setRequestedOrientation();
					_Time2();
					_savein();
					_saveint();
					_getInt();
					_edString();
					_getVirebil();
					_edInt();
					_edInt2();
					_edBaool();
					_ClipboardManager();
					_publicview();
					_savebooale();
					_getDataBoolean();
					DataBundel();
					getSignture();
					getSHA1();
					getSizeApp();
					_getCrEncode();
					_getEncode();
					_getDecode();
					_getClassName();
					_WindowManager();
					_fierbes();
					if (!containsNonWhitespace(line1)) {
						s = "jjfjrj";
					}
					if (stop.equals("")) {
							if (line1.replaceAll("\\s", "").equals("}")) {
													s = "djdj";
											}
											if (line1.replace("	", "").equals("")) {
													s = "djdj";
											}
											toast = line1.replaceAll("\\s", "");
											toast = toast.replace("	", "");
											if (toast.equals("")) {
													s = "djdj";
											}
											if (s.equals("")) {
													_erorrnov(error, line1);
											}
					}
					else {
						
					}
				}
				else {
					
				}
			} catch (Exception e) {
				
			}
		}
		
		    input.close();		   
		   	 	del2(pkgapp);   
		eroor = "fhfh";
		 }
		    public static boolean containsNonWhitespace(String str) {
				        if (str == null || str.isEmpty()) {
						            return false;
						        }
				
				        // يتم استخدام التعبير العادي (Regex) للبحث عن أي حرف غير الفاصلة
				        Pattern pattern = Pattern.compile("\\P{Z}");
				        Matcher matcher = pattern.matcher(str);
				
				        return matcher.find();
				    
			
	}
	
	
	public static void _delete() {
		if (saveline.contains("delete")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ":".concat(ck.replace("delete", "+"));
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("delete", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										if (StopLine.equals("")) {
											FileUtil.deleteFile(m3.group());
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										FileUtil.deleteFile(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
									}
								}
								else {
									_erorr2("delete", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("delete", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("delete", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("delete", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("delete", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _string() {
		if (saveline.contains("String ")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace("String", "+");
			ck = ":".concat(ck);
			Matcher a = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(ck);
			while (a.find()) {
					String d=a.group();
					d = d.replace("=", "tm12121afrdgn9778uhffg1m86t334434464sfhh75");
					line1 = line1.replace(a.group(), d);
					
			}
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				linestring = line1;
				linestring = linestring.replace("String ", ",");
				lineck = linestring;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					s = "jjfjrj";
					if (linestring.contains("=")) {
						Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\=)").matcher(linestring);
						while (m1.find()) {
								
								createString = m1.group().replaceAll("\\s", "");
							Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(line1);
							while (m2.find()) {
									
									if (m2.group().contains("\"")) {
									Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(saveline);
									while (m3.find()) {
											
											if (createString.equals("")) {
											_erorr2("String", error, "الرجاء كتابة اسم الى String");
										}
										else {
										String s=m3.group();
										s = s.replace("tm12121afrdgn9778uhffg1m86t334434464sfhh75", "=");
											FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/String/")));
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(createString))), s);
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/StringData")), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/StringData"))).concat("\n".concat("String ".concat(createString.concat(";")))));
										}
											
									}
								}
								else {
									stoperror = "dsdd";
									if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
										if (createString.equals("")) {
											_erorr2("String", error, "الرجاء كتابة اسم الى String");
										}
										else {
											FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/String/")));
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(createString))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/StringData")), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/StringData"))).concat("\n".concat("String ".concat(createString.concat(";")))));
										}
									}
									else {
										_erorr2("String", error, "لم يتم العثور على ".concat(ck));
									}
								}
									
							}
								
						}
						if (saveline.contains("\"")) {
							
						}
						else {
							if (stop.equals("")) {
								if (stoperror.equals("")) {
									_erorr2("String", error, "الرجاء كتابة \" وتحقق من صحت الكود");
								}
								else {
									
								}
							}
							else {
								
							}
						}
						if (saveline.contains("=")) {
							
						}
						else {
							if (stop.equals("")) {
								_erorr2("String", error, "الرجاء كتابة = وتحقق من صحت الكود");
							}
							else {
								
							}
						}
					}
					else {
						Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(linestring);
						while (m1.find()) {
								
								createString = m1.group().replaceAll("\\s", "");
							FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/String/")));
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(createString))), "");
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/StringData")), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/StringData"))).concat("\n".concat("String ".concat(createString.concat(";")))));
								
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("String", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			if (saveline.contains("=")) {
						
				ck = line1;
				Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
				while (m100018000.find()) {
						
						ck = ck.replace(m100018000.group(), "");
					ck = ck.replace("=", "");
					ck = ck.replace(";", "");
					ck = ck.replaceAll("\\s", "");
					if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(ck))))) {
						ck = "";
					}
						
				}
				if (ck.equals("")) {
				Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
					Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(line1);
					while (m2.find()) {
							
							createString = line1.replace(m2.group(), "");
						createString = createString.replace(";", "");
						createString = createString.replace("=", "");
						createString = createString.replaceAll("\\s", "");
						s = "mdmdkdkd";
						if (m2.group().contains("\"")) {
							Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(saveline);
							while (m3.find()) {
									
									if (createString.equals("")) {
									_erorr2("String", error, "الرجاء كتابة اسم الى String");
								}
								else {
								String s=m3.group();
									FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/String/")));
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(createString))), s);
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/StringData")), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/StringData"))).concat("\n".concat("String ".concat(createString.concat(";")))));
								}
									
							}
						}
						else {
							stoperror = "dsdd";
							if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
								if (createString.equals("")) {
									_erorr2("String", error, "الرجاء كتابة اسم الى String");
								}
								else {
									FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/String/")));
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(createString))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/StringData")), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/StringData"))).concat("\n".concat("String ".concat(createString.concat(";")))));
								}
							}
							else {
								_erorr2("String", error, "لم يتم العثور على ".concat(m2.group()));
							}
						}
							
					}
				}
			}
		}
	}
	
	
	public static void _copyfile() {
		if (saveline.contains("copyfile")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("copyfile", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("copyfile", ":");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\:(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\:)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
						while (m2.find()) {
								
								if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										copyfilestring = m3.group();
										Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(m1.group());
										while (m4.find()) {
												
												if (m4.group().contains("\"")) {
												Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
												while (m5.find()) {
														
														if (m5.group().equals("") || m5.group().equals(" ")) {
														
													}
													else {
														if (StopLine.equals("")) {
															FileUtil.copyFile(copyfilestring, m5.group());
														}
													}
														
												}
											}
											else {
												stoperror = "dsdd";
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
													if (StopLine.equals("")) {
														FileUtil.copyFile(copyfilestring, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")));
													}
												}
												else {
													_erorr2("copyfile", error, "لم يتم العثور على ".concat(m4.group()));
												}
											}
												
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									copyfilestring = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
									while (m4.find()) {
											
											if (m4.group().contains("\"")) {
											Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
											while (m5.find()) {
													
													if (m5.group().equals("") || m5.group().equals(" ")) {
													
												}
												else {
													if (StopLine.equals("")) {
														FileUtil.copyFile(copyfilestring, m5.group());
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
												if (StopLine.equals("")) {
													FileUtil.copyFile(copyfilestring, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")));
												}
											}
											else {
												_erorr2("copyfile", error, "لم يتم العثور على ".concat(m4.group()));
											}
										}
											
									}
								}
								else {
									_erorr2("copyfile", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("copyfile", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("copyfile", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("copyfile", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
					if (saveline.contains(",")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("copyfile", error, "الرجاء كتابة , وتحقق من صحت الكود");
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("copyfile", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _copydir() {
		if (saveline.contains("copydir")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("copydir", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("copydir", ":");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\:(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\:)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
						while (m2.find()) {
								
								if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										copyfilestring = m3.group();
										Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
										while (m4.find()) {
												
												if (m4.group().contains("\"")) {
												Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
												while (m5.find()) {
														
														if (m5.group().equals("") || m5.group().equals(" ")) {
														
													}
													else {
														if (StopLine.equals("")) {
															FileUtil.copyDir(copyfilestring, m5.group());
														}
													}
														
												}
											}
											else {
												stoperror = "dsdd";
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
													if (StopLine.equals("")) {
														FileUtil.copyDir(copyfilestring, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")));
													}
												}
												else {
													_erorr2("copydir", error, "لم يتم العثور على ".concat(m4.group()));
												}
											}
												
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									copyfilestring = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(m1.group());
									while (m4.find()) {
											
											if (m4.group().contains("\"")) {
											Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
											while (m5.find()) {
													
													if (m5.group().equals("") || m5.group().equals(" ")) {
													
												}
												else {
													if (StopLine.equals("")) {
														FileUtil.copyDir(copyfilestring, m5.group());
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
												if (StopLine.equals("")) {
													FileUtil.copyDir(copyfilestring, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")));
												}
											}
											else {
												_erorr2("copydir", error, "لم يتم العثور على ".concat(m4.group()));
											}
										}
											
									}
								}
								else {
									_erorr2("copydir", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("copydir", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("copydir", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("copydir", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
					if (saveline.contains(",")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("copydir", error, "الرجاء كتابة , وتحقق من صحت الكود");
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("copydir", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _publk() {
		_movefile();
		_renamefile();
		_writefile();
		_PackageName();
		_PackageDataV2();
		_ExAssets();
		_finishAffinity();
		_MakeDirectory();
		_AddFile();
		_UnzipV();
	}
	
	
	public static void _movefile() {
		if (saveline.contains("movefile")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("movefile", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("movefile", ":");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\:(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\:)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
						while (m2.find()) {
								
								if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										copyfilestring = m3.group();
										Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
										while (m4.find()) {
												
												if (m4.group().contains("\"")) {
												Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
												while (m5.find()) {
														
														if (m5.group().equals("") || m5.group().equals(" ")) {
														
													}
													else {
														if (StopLine.equals("")) {
															FileUtil.moveFile(copyfilestring, m5.group());
														}
													}
														
												}
											}
											else {
												stoperror = "dsdd";
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
													if (StopLine.equals("")) {
														FileUtil.moveFile(copyfilestring, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")));
													}
												}
												else {
													_erorr2("movefile", error, "لم يتم العثور على ".concat(m4.group()));
													toast = toast.concat(toastfil.concat("يوجد خطأ في سطر ".concat(String.valueOf((long)(error)))));
													SketchwareUtil.showMessage(m, toast);
													stop = "gg";
												}
											}
												
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									copyfilestring = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(m1.group());
									while (m4.find()) {
											
											if (m4.group().contains("\"")) {
											Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
											while (m5.find()) {
													
													if (m5.group().equals("") || m5.group().equals(" ")) {
													
												}
												else {
													if (StopLine.equals("")) {
														FileUtil.moveFile(copyfilestring, m5.group());
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
												if (StopLine.equals("")) {
													FileUtil.moveFile(copyfilestring, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")));
												}
											}
											else {
												_erorr2("movefile", error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2("movefile", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("movefile", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("movefile", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("movefile", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
					if (saveline.contains(",")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("movefile", error, "الرجاء كتابة , وتحقق من صحت الكود");
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("movefile", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _renamefile() {
		if (saveline.contains("renamefile")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("renamefile", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("renamefile", ":");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\:(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\:)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
						while (m2.find()) {
								
								if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										copyfilestring = m3.group();
										Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
										while (m4.find()) {
												
												if (m4.group().contains("\"")) {
												Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
												while (m5.find()) {
														
														if (m5.group().equals("") || m5.group().equals(" ")) {
														
													}
													else {
														if (StopLine.equals("")) {
															{
																java.io.File dYx4Y = new java.io.File(copyfilestring);
																java.io.File e5Cyk = new java.io.File(m5.group());
																dYx4Y.renameTo(e5Cyk);
															}
														}
													}
														
												}
											}
											else {
												stoperror = "dsdd";
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
													if (StopLine.equals("")) {
														{
															java.io.File dYx4Y = new java.io.File(copyfilestring);
															java.io.File e5Cyk = new java.io.File(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")));
															dYx4Y.renameTo(e5Cyk);
														}
													}
												}
												else {
													_erorr2("renamefile", error, "لم يتم العثور على ".concat(m4.group()));
												}
											}
												
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									copyfilestring = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(m1.group());
									while (m4.find()) {
											
											if (m4.group().contains("\"")) {
											Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
											while (m5.find()) {
													
													if (m5.group().equals("") || m5.group().equals(" ")) {
													
												}
												else {
													if (StopLine.equals("")) {
														{
															java.io.File dYx4Y = new java.io.File(copyfilestring);
															java.io.File e5Cyk = new java.io.File(m5.group());
															dYx4Y.renameTo(e5Cyk);
														}
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
												if (StopLine.equals("")) {
													{
														java.io.File dYx4Y = new java.io.File(copyfilestring);
														java.io.File e5Cyk = new java.io.File(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")));
														dYx4Y.renameTo(e5Cyk);
													}
												}
											}
											else {
												_erorr2("renamefile", error, "لم يتم العثور على ".concat(m4.group()));
											}
										}
											
									}
								}
								else {
									_erorr2("renamefile", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("renamefile", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("renamefile", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("renamefile", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
					if (saveline.contains(",")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("renamefile", error, "الرجاء كتابة , وتحقق من صحت الكود");
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("renamefile", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _writefile() {
		if (saveline.contains("writefile")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("writefile", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("writefile", ":");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\:(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\:)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
						while (m2.find()) {
								
								if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										copyfilestring = m3.group();
										Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
										while (m4.find()) {
												
												if (m4.group().contains("\"")) {
												Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
												while (m5.find()) {
														
														if (m5.group().equals("") || m5.group().equals(" ")) {
														
													}
													else {
														if (StopLine.equals("")) {
															FileUtil.writeFile(m5.group(), copyfilestring);
														}
													}
														
												}
											}
											else {
												stoperror = "dsdd";
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
													if (StopLine.equals("")) {
														FileUtil.writeFile(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")), copyfilestring);
													}
												}
												else {
													_erorr2("writefile", error, "لم يتم العثور على ".concat(m4.group()));
												}
											}
												
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									copyfilestring = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(m1.group());
									while (m4.find()) {
											
											if (m4.group().contains("\"")) {
											Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
											while (m5.find()) {
													
													if (m5.group().equals("") || m5.group().equals(" ")) {
													
												}
												else {
													if (StopLine.equals("")) {
														FileUtil.writeFile(m5.group(), copyfilestring);
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
												if (StopLine.equals("")) {
													FileUtil.writeFile(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")), copyfilestring);
												}
											}
											else {
												_erorr2("writefile", error, "لم يتم العثور على ".concat(m4.group()));
											}
										}
											
									}
								}
								else {
									_erorr2("writefile", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("writefile", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("writefile", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("writefile", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
					if (saveline.contains(",")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("writefile", error, "الرجاء كتابة , وتحقق من صحت الكود");
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("writefile", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _PackageName() {
		if (saveline.contains("PackageName();")) {
			s = "jjfjrj";
			FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/String/")));
			FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("PackageName()"))), pkgapp);
		}
	}
	
	
	public static void _PackageDataV2() {
		if (saveline.contains("PackageData();")) {
			s = "jjfjrj";
			FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/String/")));
			FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("PackageData()"))), PackageData);
		}
	}
	
	
	public static void _CopyAssets(final String _FileLoad, final String _a2path, final String _sua, final String _aem) {
		fname = _FileLoad;
		savePath = _a2path;
		FileUtil.makeDir(savePath.concat(fname.substring((int)(0), (int)(fname.indexOf("/")))));
		try{
			int count;
			java.io.InputStream input= m.getAssets().open(fname);
			java.io.OutputStream output = new  java.io.FileOutputStream(savePath+"/"+fname);
			byte data[] = new byte[1024];
			while ((count = input.read(data))>0) {
				output.write(data, 0, count);
			}
			output.flush();
			output.close();
			input.close();
			MASSEGE = _sua;
			TEXT_COLOR = "";
			BG_COLOR = "";
			BORDER_COLOR = "";
			int hight = 50;
			int width = 150;
			LinearLayout v = new LinearLayout(m);
			TextView tvu = new TextView(m);
			
			tvu.setGravity(Gravity.CENTER);
			
			if(TEXT_COLOR.equals("")){
				tvu.setTextColor(Color.parseColor("#000000"));
			}else{
				tvu.setTextColor(Color.parseColor(TEXT_COLOR));
			}
			
			tvu.setLayoutParams(new ViewGroup.LayoutParams( width, hight));
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			android.graphics.drawable.GradientDrawable ed = new android.graphics.drawable.GradientDrawable();
			
			if(BG_COLOR.equals("")){
				ed.setColor(Color.parseColor("#FFFFFF"));
			}else{
				ed.setColor(Color.parseColor(BG_COLOR));
			}
			
			ed.setCornerRadius(4);
			
			if(BORDER_COLOR.equals("")){
				gd.setColor(Color.parseColor("#000000"));
			}else{
				gd.setColor(Color.parseColor(BORDER_COLOR));
			}
			gd.setCornerRadius(6);
			v.setBackground(gd);
			tvu.setBackground(ed);
			v.setPadding(2,2,2,2);
			tvu.setText(MASSEGE);
			v.addView(tvu);
			Toast t = Toast.makeText(m,"",Toast.LENGTH_LONG);
			t.setView(v);
		}catch(Exception e){
			MASSEGE = _aem;
			TEXT_COLOR = "";
			BG_COLOR = "";
			BORDER_COLOR = "";
			int hight = 50;
			int width = 150;
			LinearLayout v = new LinearLayout(m);
			TextView tvu = new TextView(m);
			
			tvu.setGravity(Gravity.CENTER);
			
			if(TEXT_COLOR.equals("")){
				tvu.setTextColor(Color.parseColor("#000000"));
			}else{
				tvu.setTextColor(Color.parseColor(TEXT_COLOR));
			}
			
			tvu.setLayoutParams(new ViewGroup.LayoutParams( width, hight));
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			android.graphics.drawable.GradientDrawable ed = new android.graphics.drawable.GradientDrawable();
			
			if(BG_COLOR.equals("")){
				ed.setColor(Color.parseColor("#FFFFFF"));
			}else{
				ed.setColor(Color.parseColor(BG_COLOR));
			}
			
			ed.setCornerRadius(4);
			
			if(BORDER_COLOR.equals("")){
				gd.setColor(Color.parseColor("#000000"));
			}else{
				gd.setColor(Color.parseColor(BORDER_COLOR));
			}
			gd.setCornerRadius(6);
			v.setBackground(gd);
			tvu.setBackground(ed);
			v.setPadding(2,2,2,2);
			tvu.setText(MASSEGE);
			v.addView(tvu);
			Toast t = Toast.makeText(m,"",Toast.LENGTH_LONG);
			t.setView(v);
		}
	}
	
	
	public static void _ExAssets() {
		if (saveline.contains("ExAssets")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("ExAssets", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("ExAssets", ":");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\:(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\:)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
						while (m2.find()) {
								
								if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										copyfilestring = m3.group();
										Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
										while (m4.find()) {
												
												if (m4.group().contains("\"")) {
												Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
												while (m5.find()) {
														
														if (m5.group().equals("") || m5.group().equals(" ")) {
														
													}
													else {
														if (StopLine.equals("")) {
															_CopyAssets(copyfilestring, m5.group(), "", "");
														}
													}
														
												}
											}
											else {
												stoperror = "dsdd";
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
													if (StopLine.equals("")) {
														_CopyAssets(copyfilestring, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")), "", "");
													}
												}
												else {
													_erorr2("ExAssets", error, "لم يتم العثور على ".concat(m4.group()));
												}
											}
												
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									copyfilestring = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(m1.group());
									while (m4.find()) {
											
											if (m4.group().contains("\"")) {
											Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
											while (m5.find()) {
													
													if (m5.group().equals("") || m5.group().equals(" ")) {
													
												}
												else {
													if (StopLine.equals("")) {
														_CopyAssets(copyfilestring, m5.group(), "", "");
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
												if (StopLine.equals("")) {
													_CopyAssets(copyfilestring, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")), "", "");
												}
											}
											else {
												_erorr2("ExAssets", error, "لم يتم العثور على ".concat(m4.group()));
											}
										}
											
									}
								}
								else {
									_erorr2("ExAssets", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("ExAssets", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("ExAssets", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("ExAssets", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
					if (saveline.contains(",")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("ExAssets", error, "الرجاء كتابة , وتحقق من صحت الكود");
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("ExAssets", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _finishAffinity() {
		if (saveline.contains("finishAffinity();")) {
			s = "jjfjrj";
			if (StopLine.equals("")) {
				m.finishAffinity();
			}
		}
	}
	
	
	public static void _MakeDirectory() {
		if (saveline.contains("MakeDirectory")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace("MakeDirectory", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("MakeDirectory", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										if (StopLine.equals("")) {
											FileUtil.makeDir(m3.group());
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										FileUtil.makeDir(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
									}
								}
								else {
									_erorr2("MakeDirectory", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("MakeDirectory", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("MakeDirectory", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("MakeDirectory", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					line1 = saveline;
				}
				if (saveline.contains(";")) {
					
				}
				else {
					_erorr2("MakeDirectory", error, "الرجاء كتابة ; نهاية الكود");
				}
			}
		}
	}
	
	
	public static void _AddFile() {
		if (saveline.contains("AddFile")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace("AddFile", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("AddFile", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(line1);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\{)").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										if (StopLine.equals("")) {
											AddFileString = m3.group();
											StopLine = "1";
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										AddFileString = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
										StopLine = "1";
									}
								}
								else {
									_erorr2("AddFile", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("AddFile", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("AddFile", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("AddFile", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
					if (saveline.contains("{")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("AddFile", error, "الرجاء كتابة } نهاية الكود");
						}
						else {
							
						}
					}
				}
				else {
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _Unzip(final String _path) {
		ZipMan thanks = new ZipMan();
		thanks.Unzip(_path);
	}
	public static class ZipMan {
			public static void main(String[] args) throws Exception{
					String sourceFolderName =  "/sdcard/aan";
					String outputFileName = "/sdcard/aan.zip";
					java.io.FileOutputStream fos = new java.io.FileOutputStream(outputFileName);
					java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(fos);
					zos.setLevel(9);
					System.out.println("Begin to compress folder : " + sourceFolderName + " to " + outputFileName);
					_Zip(zos, sourceFolderName, sourceFolderName);
					zos.close();
					System.out.println("Program ended successfully!");
			}
			private static void _Zip(java.util.zip.ZipOutputStream zos,String folderName,String baseFolderName)throws Exception{
					java.io.File f = new java.io.File(folderName);
					if(f.exists()){
							if(f.isDirectory()){
									if(!folderName.equalsIgnoreCase(baseFolderName)){
											String entryName = folderName.substring(baseFolderName.length()+1,folderName.length()) + java.io.File.separatorChar;
											System.out.println("Adding folder entry " + entryName);
											java.util.zip.ZipEntry ze= new java.util.zip.ZipEntry(entryName);
											zos.putNextEntry(ze);	
									}
									java.io.File f2[] = f.listFiles();
									for(int i=0;i<f2.length;i++){
											_Zip(zos,f2[i].getAbsolutePath(),baseFolderName);	
									}
							}else{
									String entryName = folderName.substring(baseFolderName.length()+1,folderName.length());
									System.out.print("Adding file entry " + entryName + "...");
									java.util.zip.ZipEntry ze= new java.util.zip.ZipEntry(entryName);
									zos.putNextEntry(ze);
									java.io.FileInputStream in = new java.io.FileInputStream(folderName);
									int len;
									byte buffer[] = new byte[1024];
									while ((len = in.read(buffer)) > 0) {
											zos.write(buffer, 0, len);
									}
									in.close();
									zos.closeEntry();
									System.out.println("OK!");
							}
					}else{
							System.out.println("File or directory not found " + folderName);
					}
			}
			private static void Unzip(String strZipFile) {
					try {
							java.io.File fSourceZip = new java.io.File(strZipFile);
							String zipPath = strZipFile.substring(0, strZipFile.length()-4);
							java.io.File temp = new java.io.File(zipPath);
							temp.mkdir();
							System.out.println(zipPath + " created");
							java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(fSourceZip);
							java.util.Enumeration e = zipFile.entries();
							while(e.hasMoreElements()) {
									java.util.zip.ZipEntry entry = (java.util.zip.ZipEntry)e.nextElement();
									java.io.File destinationFilePath = new java.io.File(zipPath,entry.getName());
									destinationFilePath.getParentFile().mkdirs();
									if(entry.isDirectory()) {
											continue;
									} else {
											System.out.println("Extracting " + destinationFilePath);
											java.io.BufferedInputStream bis = new java.io.BufferedInputStream(zipFile.getInputStream(entry));
											int b;
											byte buffer[] = new byte[1024];
											java.io.FileOutputStream fos = new java.io.FileOutputStream(destinationFilePath);
											java.io.BufferedOutputStream bos = new java.io.BufferedOutputStream(fos,1024);
											while ((b = bis.read(buffer, 0, 1024)) != -1) {
														bos.write(buffer, 0, b);
											}
											//flush the output stream and close it.
											bos.flush();
											bos.close();
											//close the input stream.
											bis.close();
									}
							}
					} catch(java.io.IOException ioe) {
							System.out.println("IOError :" + ioe);
					}
			}
	}
	 {
	}
	
	
	public static void _UnzipV() {
		if (saveline.contains("Unzip")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("Unzip", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("Unzip", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										if (StopLine.equals("")) {
											_Unzip(m3.group());
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										_Unzip(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
									}
								}
								else {
									_erorr2("Unzip", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("Unzip", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("Unzip", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("Unzip", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("Unzip", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _rippleRoundStroke(final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor("#FF757575")}), GG, null);
		_view.setBackground(RE);
		_view.setElevation(5);
	}
	
	
	public static void _redfile() {
		if (saveline.contains(".readfile")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".readfile", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
				else {
					
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".readfile", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(lineck.concat(";")))) {
						lineck = "";
					}
					else {
						
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										s = "jjfjrj";
									if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (FileUtil.isFile(m3.group())) {
													if (StopLine.equals("")) {
														FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), FileUtil.readFile(m3.group()));
													}
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (FileUtil.isFile(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")))) {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
												}
											}
										}
										else {
											_erorr2("readfile", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2("readfile", error, "لم يتم العثور على ".concat(Stringck.concat("\nاو لم تقم بانشاء String")));
							}
						}
						else {
							_erorr2("readfile", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("readfile", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
	
	
public static void _EditFile() {
		if (saveline.contains("EditFile")) {
			
			toast = saveline;
			ck = line1.replace("+", "");
			ck = ck.replace("EditFile", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("EditFile", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					toast = toast.replace("\\=", "28282829292929sjsjsjejejsnskskskdjtbrjenssn s dbejsbfhtjmustafagghh1001010110101029292929");
					toast = toast.replace("\\,", "28282829292929sjsjsjejejsnskskskdjtbrjenssns dbejsbfhtjckgghh1001010110101029292929");
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(toast);
						while (m2.find()) {
								
								if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										if (StopLine.equals("")) {
											dl = m3.group().replace("28282829292929sjsjsjejejsnskskskdjtbrjenssns dbejsbfhtjckgghh1001010110101029292929", ",");
											dl = dl.replace("28282829292929sjsjsjejejsnskskskdjtbrjenssn s dbejsbfhtjmustafagghh1001010110101029292929", "=");
											filee = dl;
											editfile = FileUtil.readFile(dl);
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										dl = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")).replace("28282829292929sjsjsjejejsnskskskdjtbrjenssns dbejsbfhtjckgghh1001010110101029292929", ",");
										dl = dl.replace("28282829292929sjsjsjejejsnskskskdjtbrjenssn s dbejsbfhtjmustafagghh1001010110101029292929", "=");
										editfile = dl;
										editfile = FileUtil.readFile(editfile);
										filee = FileUtil.readFile(dl);
									}
								}
								else {
									_erorr2("EditFile", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
						Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\=)").matcher(toast);
						while (m4.find()) {
								
								if (m4.group().contains("\"")) {
								Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
								while (m5.find()) {
										
										if (m5.group().equals("") || m5.group().equals(" ")) {
										
									}
									else {
										if (StopLine.equals("")) {
											dl = m5.group().replace("28282829292929sjsjsjejejsnskskskdjtbrjenssns dbejsbfhtjckgghh1001010110101029292929", ",");
											dl = dl.replace("28282829292929sjsjsjejejsnskskskdjtbrjenssn s dbejsbfhtjmustafagghh1001010110101029292929", "=");
											addfie = dl;
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										dl = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")).replace("28282829292929sjsjsjejejsnskskskdjtbrjenssns dbejsbfhtjckgghh1001010110101029292929", ",");
										dl = dl.replace("28282829292929sjsjsjejejsnskskskdjtbrjenssn s dbejsbfhtjmustafagghh1001010110101029292929", "=");
										addfie = dl;
									}
								}
								else {
									_erorr2("EditFile", error, "لم يتم العثور على ".concat(m4.group()));
								}
							}
								
						}
						Matcher m6 = Pattern.compile("(?<=\\=)(.*)(?=\\))").matcher(toast);
						while (m6.find()) {
								
								if (m6.group().contains("\"")) {
								Matcher m7 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m6.group());
								while (m7.find()) {
										
										if (m7.group().equals("") || m7.group().equals(" ")) {
										
									}
									else {
										if (StopLine.equals("")) {
											dl = m7.group().replace("28282829292929sjsjsjejejsnskskskdjtbrjenssns dbejsbfhtjckgghh1001010110101029292929", ",");
											dl = dl.replace("28282829292929sjsjsjejejsnskskskdjtbrjenssn s dbejsbfhtjmustafagghh1001010110101029292929", "=");
											ed = dl;
											edit = editfile.replace(addfie, ed);
											FileUtil.writeFile(filee, edit);
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m6.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										dl = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m6.group()))).replaceAll("\\s", "")).replace("28282829292929sjsjsjejejsnskskskdjtbrjenssns dbejsbfhtjckgghh1001010110101029292929", ",");
										dl = dl.replace("28282829292929sjsjsjejejsnskskskdjtbrjenssn s dbejsbfhtjmustafagghh1001010110101029292929", "=");
										ed = dl;
										edit = editfile.replace(addfie, ed);
										FileUtil.writeFile(filee, edit);
									}
								}
								else {
									_erorr2("EditFile", error, "لم يتم العثور على ".concat(m6.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("EditFile", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("EditFile", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("EditFile", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("EditFile", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
public static void _Dialog() {
		if (saveline.contains("Dialog ")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("Dialog", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\+)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				lineck = line1.replace("Dialog ", ",");
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					line1 = line1.replace("Dialog ", ",");
					lineck = line1;
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							erorno = m1.group().replaceAll("\\s", "");
							if (!FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(erorno.concat(";")))) {
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/Dialog")));
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(erorno));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).concat("\n".concat("Dialog ".concat(erorno.concat(";")))));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(erorno.concat("/".concat(erorno.concat("id")))), String.valueOf((long)(dlo)));
								AlertDialog.Builder d1= new AlertDialog.Builder(m);
								   dlog0.add(d1);
								dlo++;
								if (StopLine.equals("")) {
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(erorno.concat("/".concat(erorno.concat("mo")))), "true");
								}
							}
							else {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(erorno.concat("/".concat(erorno.concat("mo")))))) {
									_erorr2("Dialog", error, "الرجاء تغير الاسم لان الاسم مستخدم من قبل عنصر اخر");
								}
							}
						}
						else {
							_erorr2("Dialog", error, "الرجاء كتابة اسم للDialog");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("Dialog", error, "الرجاء كتابه ; نهاية الكود");
					}
					line1 = saveline;
					_Dltitle();
				}
			}
			else {
				_Dltitle();
			}
		}
		else {
			_Dltitle();
		}
	}	
	
	public static void _Dltitle() {
		if (saveline.contains(".title")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".title", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				ck = ck.replaceAll("\\s", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".title", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
						lineck = lineck.replaceAll("\\s", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("title"))), m3.group());
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("title"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
											}
										}
										else {
											_erorr2("title", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2("title", error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل Dialog"))));
							}
						}
						else {
							_erorr2("title", error, "الرجاء تحقق من الكود");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("title", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_Dlmessage();
		}
	}
	
	
	public static void _Dlmessage() {
		if (saveline.contains(".message")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".message", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".message", ",");
				line1 = line1.replace("{", "");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("message"))), m3.group());
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("message"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
											}
										}
										else {
											_erorr2("message", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2("message", error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2("message", error, "الرجاء تحقق من الكود");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("message", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_Dlbutton();
		}
	}
	
	
	
public static void _DlStart() {
		if (saveline.contains(".start()")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace(".start()", "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".start()", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								if (StopLine.equals("")) {
									button = Dialogs;
									AlertDialog.Builder d1= dlog0.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));
									if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("title"))))) {
										if (StopLine.equals("")) {
											title = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("title"))));
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorTitle"))))) {
												String titleText = title;       
												        SpannableString spannableTitle = new SpannableString(titleText);
												        spannableTitle.setSpan(new ForegroundColorSpan(Color.parseColor(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorTitle")))))), 0, titleText.length(), 0);
												        d1.setTitle(spannableTitle);
											}
											else {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("color"))))) {
													String titleText = title;       
													        SpannableString spannableTitle = new SpannableString(titleText);
													        spannableTitle.setSpan(new ForegroundColorSpan(Color.parseColor(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("color")))))), 0, titleText.length(), 0);
													        d1.setTitle(spannableTitle);
												}
												else {
													d1.setTitle(title);
												}
											}
										}
									}
									else {
										
									}
									if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("message"))))) {
										if (StopLine.equals("")) {
											message = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("message"))));
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorMessage"))))) {
												String titleText2 = message;       
												        SpannableString spannableTitle2 = new SpannableString(titleText2);
												        spannableTitle2.setSpan(new ForegroundColorSpan(Color.parseColor(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorMessage")))))), 0, titleText2.length(), 0);    
												d1.setMessage(spannableTitle2);
											}
											else {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("color"))))) {
													String titleText2 = message;       
													        SpannableString spannableTitle2 = new SpannableString(titleText2);
													        spannableTitle2.setSpan(new ForegroundColorSpan(Color.parseColor(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("color")))))), 0, titleText2.length(), 0);    
													d1.setMessage(spannableTitle2);
												}
												else {
													d1.setMessage(message);
												}
											}
										}
									}
									else {
										
									}
									_start2(d1);
								}
							}
							else {
								_erorr2("start", error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2("start", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("start", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	
	public static void _Dlbutton() {
		if (saveline.contains(".button1")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".button1", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\{)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".button1", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\{").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							Dialogs = Dialogs.replace(";", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\{)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button1"))), m3.group());
													AddFileString = "/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button1on")));
													Stringfile = "";
													StopLine = "2";
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button1"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
												button1st = "/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button1on")));
												Stringfile = "";
												StopLine = "2";
											}
										}
										else {
											_erorr2("button1", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2("button1", error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2("button1", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains("{")) {
						
					}
					else {
						_erorr2("button1", error, "الرجاء كتابة } نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_Dlbutton2();
		}
	}
	
	
	public static void _importDrive() {
		if (saveline.contains("import")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace("import", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("import", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										if (FileUtil.isFile(m3.group())) {
											if (StopLine.equals("")) {
												try {
															
													StopLine = "";
													Stringfile = "";
													AddFileont = 0;
													toast = "";
													toastfil = "";
													Dialogs = "";
													message = "";
													title = "";
													stop = "";
													lineCounter(m3.group());
															} catch(Exception e) {
																
														}
											}
										}
										else {
											_erorr2("import", error, "لم يتم العثور على ".concat(m3.group()));
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										try {
													
											StopLine = "";
											Stringfile = "";
											AddFileont = 0;
											toast = "";
											toastfil = "";
											Dialogs = "";
											message = "";
											title = "";
											stop = "";
											lineCounter(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
													} catch(Exception e) {
														
												}
									}
								}
								else {
									_erorr2("import", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("import", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("import", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("import", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("import", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _Dlbutton2() {
		if (saveline.contains(".button2")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".button2", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\{)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".button2", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\{").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\{)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button2"))), m3.group());
													AddFileString = "/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button2on")));
													Stringfile = "";
													StopLine = "2";
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button2"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
												AddFileString = "/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button2on")));
												Stringfile = "";
												StopLine = "2";
											}
										}
										else {
											_erorr2("button2", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2("button2", error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2("button2", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains("{")) {
						
					}
					else {
						_erorr2("button2", error, "الرجاء كتابة } نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_DlCancelable();
		}
	}
	
	
	public static void _Time() {
		if (saveline.contains("Time") && !saveline.contains("Timer")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("Time", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("Time", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(line1);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					s = "jjfjrj";
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\{)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								String regex = "^[0-9]+$";
							
							     
							toast = m2.group().replaceAll("\\s", "");
							if (toast.matches(regex)) {
								if (StopLine.equals("")) {
									Stringfile = "";
									AddFileString = toast;
									Time2f = "Time".concat(String.valueOf((long)(SketchwareUtil.getRandom((int)(10000), (int)(99999)))));
									StopLine = "3";
								}
							}
							else {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										Stringfile = "";
										AddFileString = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""));
										Time2f = "Time".concat(String.valueOf((long)(SketchwareUtil.getRandom((int)(10000), (int)(99999)))));
										StopLine = "3";
									}
								}
								else {
									_erorr2("Time", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("Time", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("Time", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("{")) {
						
					}
					else {
						_erorr2("Time", error, "الرجاء كتابة } نهاية الكود");
					}
				}
				else {
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _imports(final String _file) {
		try {
					
			lineCounter(_file);
					} catch(Exception e) {
						
				}
	}
	
	
	public static void _DlCancelable() {
		if (saveline.contains(".cancelable")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace(".cancelable", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".cancelable", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m3 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m3.find()) {
										
										s = "jjfjrj";
									if (m3.group().equals("") || m3.group().equals(" ")) {
										_erorr2("cancelable", error, "الرجاء كتابة true او false");
									}
									else {
										cancelable1 = m3.group().replaceAll("\\s", "");
										if (cancelable1.equals("true")) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("cancelable"))), "true");
											}
										}
										else {
											if (cancelable1.equals("false")) {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("cancelable"))), "false");
												}
											}
											else {
												_erorr2("cancelable", error, "الرجاء كتابة true او false");
											}
										}
									}
										
								}
							}
							else {
								_erorr2("cancelable", error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2("cancelable", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("cancelable", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_Dlbutton3();
		}
	}
	
	
	public static void _vibrate() {
		if (saveline.contains("vibrate")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("vibrate", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("vibrate", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
								if (StopLine.equals("")) {
									vibrate2.vibrate((long)(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", "")))));
								}
							}
							else {
								String regex = "^[0-9]+$";					
								toast = m2.group().replaceAll("\\s", "");								
								if (toast.matches(regex)) {							
									if (StopLine.equals("")) {																	
										vibrate2.vibrate((long)(Integer.parseInt(toast)));
										
									}
								}
								else {
									_erorr2("vibrate", error, "عذراً الكود غير صحيح الرجاء تحقق اذا كان الكود صحيح او لم تقم بانشاء int");
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("vibrate", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("vibrate", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("vibrate", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _TorchMode() {
		if (saveline.contains("TorchMode")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("TorchMode", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("TorchMode", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
								TorchModeck = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")).replaceAll("\\s", "");
								if (TorchModeck.equals("true")) {
									if (StopLine.equals("")) {
										android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) m.getSystemService(Context.CAMERA_SERVICE);
										try {
												String cameraId = cameraManager.getCameraIdList()[0]; cameraManager.setTorchMode(cameraId, true); } catch (android.hardware.camera2.CameraAccessException e) { }
									}
								}
								else {
									if (TorchModeck.equals("false")) {
										if (StopLine.equals("")) {
											android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) m.getSystemService(Context.CAMERA_SERVICE);
											try {
													String cameraId = cameraManager.getCameraIdList()[0]; cameraManager.setTorchMode(cameraId, false); } catch (android.hardware.camera2.CameraAccessException e) { }
										}
									}
									else {
										_erorr2("TorchMode", error, "الرجاء كتابة true او false");
									}
								}
							}
							else {
								TorchModeck = m2.group().replaceAll("\\s", "");
								if (TorchModeck.equals("true")) {
									if (StopLine.equals("")) {
										android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) m.getSystemService(Context.CAMERA_SERVICE);
										try {
												String cameraId = cameraManager.getCameraIdList()[0]; cameraManager.setTorchMode(cameraId, true); } catch (android.hardware.camera2.CameraAccessException e) { }
									}
								}
								else {
									if (TorchModeck.equals("false")) {
										if (StopLine.equals("")) {
											android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) m.getSystemService(Context.CAMERA_SERVICE);
											try {
													String cameraId = cameraManager.getCameraIdList()[0]; cameraManager.setTorchMode(cameraId, false); } catch (android.hardware.camera2.CameraAccessException e) { }
										}
									}
									else {
										_erorr2("TorchMode", error, "الرجاء كتابة true او false");
									}
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("TorchMode", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("TorchMode", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("TorchMode", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _starapp() {
		if (saveline.contains("StarApp")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace("StarApp", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("StarApp", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					line1 = line1.replaceAll("\\s", "");
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										if (saveline.contains(".true;")) {
											if (StopLine.equals("")) {
												StartAppSDK.init(m, m3.group(), true);
												StartAppAd.disableSplash();
												StartAppAd.showAd(m);
											}
										}
										else {
											if (saveline.contains(".false;")) {
												if (StopLine.equals("")) {
													StartAppSDK.init(m, m3.group(), false);
													StartAppAd.disableSplash();
													StartAppAd.showAd(m);
												}
											}
											else {
												_erorr2("StarApp", error, "الرجاء كتابة true او false");
											}
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (saveline.contains(".true;")) {
										if (StopLine.equals("")) {
											StartAppSDK.init(m, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")), true);
											StartAppAd.disableSplash();
											StartAppAd.showAd(m);
										}
									}
									else {
										if (saveline.contains(".false;")) {
											if (StopLine.equals("")) {
												StartAppSDK.init(m, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")), false);
												StartAppAd.disableSplash();
												StartAppAd.showAd(m);
											}
										}
										else {
											_erorr2("StarApp", error, "الرجاء كتابة true او false");
										}
									}
								}
								else {
									_erorr2("StarApp", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("StarApp", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("StarApp", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("StarApp", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("StarApp", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _ifck() {
		if (saveline.contains("if ")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("if", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("if ", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\{)").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (saveline.contains(".equals.") || saveline.contains(".contains.")) {
							if (saveline.contains(".equals.")) {
								mif = "1";
								addif = line1.replace(".equals.", "¶");
							}
							else {
								if (saveline.contains(".contains.")) {
									mif = "2";
									addif = line1.replace(".contains.", "¶");
								}
								else {
									_erorr2("if", error, "الرجاء كتابة equals او contains");
								}
							}
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\¶)").matcher(addif);
							while (m2.find()) {
									
									if (m2.group().contains("\"")) {
									Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
									while (m3.find()) {
											
											Matcher m4 = Pattern.compile("(?<=\\¶)(.*)(?=\\))").matcher(addif);
										while (m4.find()) {
												
												if (m4.group().contains("\"")) {
												Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
												while (m5.find()) {
														
														if (mif.equals("1")) {
														if (StopLine.equals("")) {
															if (m3.group().equals(m5.group())) {
																elset = true;
															}
															else {
																elset = false;
																StopLine = "4";
															}
														}
													}
													else {
														if (mif.equals("2")) {
															if (StopLine.equals("")) {
																if (m3.group().contains(m5.group())) {
																	elset = true;
																}
																else {
																	elset = false;
																	StopLine = "4";
																}
															}
														}
														else {
															_erorr2("if", error, "الرجاء كتابة equals او contains");
														}
													}
														
												}
											}
											else {
												stoperror = "dsdd";
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
													if (mif.equals("1")) {
														if (StopLine.equals("")) {
															if (m3.group().equals(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")))) {
																elset = true;
															}
															else {
																elset = false;
																StopLine = "4";
															}
														}
													}
													else {
														if (mif.equals("2")) {
															if (StopLine.equals("")) {
																if (m3.group().contains(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")))) {
																	elset = true;
																}
																else {
																	elset = false;
																	StopLine = "4";
																}
															}
														}
														else {
															_erorr2("if", error, "الرجاء كتابة equals او contains");
														}
													}
												}
												else {
													_erorr2("if", error, "لم يتم العثور على ".concat(m4.group()));
												}
											}
												
										}
											
									}
								}
								else {
									stoperror = "dsdd";
									if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
										Matcher m4 = Pattern.compile("(?<=\\¶)(.*)(?=\\))").matcher(addif);
										while (m4.find()) {
												
												if (m4.group().contains("\"")) {
												Matcher m5 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
												while (m5.find()) {
														
														if (mif.equals("1")) {
														if (StopLine.equals("")) {
															if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")).equals(m5.group())) {
																elset = true;
															}
															else {
																elset = false;
																StopLine = "4";
															}
														}
													}
													else {
														if (mif.equals("2")) {
															if (StopLine.equals("")) {
																if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")).contains(m5.group())) {
																	elset = true;
																}
																else {
																	elset = false;
																	StopLine = "4";
																}
															}
														}
														else {
															_erorr2("if", error, "الرجاء كتابة equals او contains");
														}
													}
														
												}
											}
											else {
												stoperror = "dsdd";
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
													if (mif.equals("1")) {
														if (StopLine.equals("")) {
															if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")).equals(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")))) {
																elset = true;
															}
															else {
																elset = false;
																StopLine = "4";
															}
														}
													}
													else {
														if (mif.equals("2")) {
															if (StopLine.equals("")) {
																if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")).contains(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")))) {
																	elset = true;
																}
																else {
																	elset = false;
																	StopLine = "4";
																}
															}
														}
														else {
															_erorr2("if", error, "الرجاء كتابة equals او contains");
														}
													}
												}
												else {
													_erorr2("if", error, "لم يتم العثور على ".concat(m4.group()));
												}
											}
												
										}
									}
									else {
										_erorr2("if", error, "لم يتم العثور على ".concat(m2.group()));
									}
								}
									
							}
						}
						else {
							_erorr2("if", error, "الرجاء كتابة equals او contains");
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("if", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("if", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("if", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
					if (saveline.contains("{")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("if", error, "الرجاء كتابة } نهاية الكود");
						}
						else {
							
						}
					}
				}
				else {
					line1 = saveline;
				}
			}
		}
		else {
			if (saveline.contains("else") && (elset && saveline.contains("{"))) {
				
				line1 = line1.replace("else", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replace("}", "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					s = "jjfjrj";
					StopLine = "4";
				}
				else {
					line1 = saveline;
				}
			}
			else {
				if (saveline.contains("else") && (!elset && saveline.contains("{"))) {
					s = "jjfjrj";
				}
			}
		}
	}
	
	
	public static void _Host() {
		if (saveline.contains("HOST();")) {
			s = "jjfjrj";
			FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/String/")));
			FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("HOST()"))), Build.HOST);
		}
	}
	
	
	public static void _isFile() {
		if (saveline.contains("isFile")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace("isFile", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("isFile", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\{)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										if (StopLine.equals("")) {
											if (FileUtil.isFile(m3.group())) {
												elset = true;
											}
											else {
												StopLine = "4";
												elset = false;
											}
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										if (FileUtil.isFile(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")))) {
											elset = true;
										}
										else {
											StopLine = "4";
											elset = false;
										}
									}
								}
								else {
									_erorr2("isFile", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("isFile", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("isFile", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("isFile", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
					if (saveline.contains("{")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("isFile", error, "الرجاء كتابة } نهاية الكود");
						}
						else {
							
						}
					}
				}
				else {
					line1 = saveline;
				}
			}
		}
		else {
			if (saveline.contains("else") && (elset && saveline.contains("{"))) {
				
				line1 = line1.replace("else", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replace("}", "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					StopLine = "4";
					s = "jjfjrj";
				}
				else {
					line1 = saveline;
				}
			}
			else {
				if (saveline.contains("else") && (!elset && saveline.contains("{"))) {
					s = "jjfjrj";
				}
			}
		}
	}
	
	
	public static void _unity() {
		if (saveline.contains("UnityAds")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace("UnityAds", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("UnityAds", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					line1 = line1.replaceAll("\\s", "");
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										if (saveline.contains(".true;")) {
											if (StopLine.equals("")) {
												UnityAds.initialize (m, m3.group(), false,false);
											}
										}
										else {
											if (saveline.contains(".false;")) {
												if (StopLine.equals("")) {
													UnityAds.initialize (m, m3.group(), true,false);
												}
											}
											else {
												_erorr2("UnityAds", error, "الرجاء كتابة true او false");
											}
										}
										if (StopLine.equals("")) {
											_unityBanner();
											_UnityRewardedAds();
											UnityAds.show(m, "Interstitial_Android");
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (saveline.contains(".true;")) {
										if (StopLine.equals("")) {
											UnityAds.initialize (m, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")), false,true);
										}
									}
									else {
										if (saveline.contains(".false;")) {
											if (StopLine.equals("")) {
												UnityAds.initialize (m, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")), false,false);
											}
										}
										else {
											_erorr2("UnityAds", error, "الرجاء كتابة true او false");
										}
									}
									if (StopLine.equals("")) {
										_unityBanner();
										_UnityRewardedAds();
										UnityAds.show(m, "Interstitial_Android");
									}
								}
								else {
									_erorr2("UnityAds", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("UnityAds", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("UnityAds", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("UnityAds", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("UnityAds", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _UnityRewardedAds() {
		IUnityAdsListener rewardedListner = new IUnityAdsListener() {
			     @Override
			  public void onUnityAdsReady(String s) {
				      
				   }
			  @Override
			  public void onUnityAdsStart(String s) {
				     
				  }
			  
			 @Override
			 public void onUnityAdsFinish(String s, UnityAds.FinishState finishState) {
				   if (finishState.equals(UnityAds.FinishState.COMPLETED)) {
					
				}
				if (finishState == UnityAds.FinishState.SKIPPED) {
					
				}
				if (finishState == UnityAds.FinishState.ERROR) {
					
				}
				 }  
			@Override
			public void onUnityAdsError(UnityAds.UnityAdsError error, String message) {
				 
			}
		};
		UnityAds.setListener(rewardedListner);
		UnityAds.load("Rewarded_Android");
	}
	
	
	public static void _unityBanner() {
		UnityBanners.loadBanner(m, "Banner_Android");
	}
	
	
	public static void _telegrambot() {
		if (saveline.contains("TelegramBot ")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("TelegramBot", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\+)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("TelegramBot ", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							erorno = m1.group().replaceAll("\\s", "");
							if (!FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt")))).contains("TelegramBot ".concat(erorno.concat(";")))) {
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/TelegramBot")));
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/TelegramBot/")).concat(erorno));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt")))).concat("\n".concat("TelegramBot ".concat(erorno.concat(";")))));
							}
						}
						else {
							_erorr2("TelegramBot", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("TelegramBot", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
					_token();
				}
			}
			else {
				_token();
			}
		}
		else {
			_token();
		}
	}
	
	
	public static void _token() {
		if (saveline.contains(".token")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".token", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt")))).contains("TelegramBot ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".token", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt")))).contains("TelegramBot ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							TelegramBot = line1.replace(m1.group(), "");
							TelegramBot = TelegramBot.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt")))).contains("TelegramBot ".concat(TelegramBot.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("token"))), m3.group());
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("token"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
											}
										}
										else {
											_erorr2("token", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2("token", error, "لم يتم العثور على ".concat(TelegramBot.concat("\nاو لم تقم بانشاء TelegramBot")));
							}
						}
						else {
							_erorr2("token", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("token", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_GroupUser();
		}
	}
	
	
	public static void _GroupUser() {
		if (saveline.contains(".groupuser")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".groupuser", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt")))).contains("TelegramBot ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".groupuser", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt")))).contains("TelegramBot ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							TelegramBot = line1.replace(m1.group(), "");
							TelegramBot = TelegramBot.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt")))).contains("TelegramBot ".concat(TelegramBot.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("groupuser"))), m3.group());
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("groupuser"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
											}
										}
										else {
											_erorr2("groupuser", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2("groupuser", error, "لم يتم العثور على ".concat(TelegramBot.concat("\nاو لم تقم بانشاء TelegramBot")));
							}
						}
						else {
							_erorr2("groupuser", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("groupuser", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_messagetele();
		}
	}
	
	
	public static void _messagetele() {
		if (saveline.contains(".botmessage")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".botmessage", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt")))).contains("TelegramBot ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".botmessage", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt")))).contains("TelegramBot ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							TelegramBot = line1.replace(m1.group(), "");
							TelegramBot = TelegramBot.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt")))).contains("TelegramBot ".concat(TelegramBot.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("message"))), m3.group());
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("message"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
											}
										}
										else {
											_erorr2("botmessage", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2("botmessage", error, "لم يتم العثور على ".concat(TelegramBot.concat("\nاو لم تقم بانشاء TelegramBot")));
							}
						}
						else {
							_erorr2("botmessage", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("botmessage", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_startbot();
		}
	}
	
	
	public static void _startbot() {
		if (saveline.contains(".botstart()")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace(".botstart()", "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt")))).contains("TelegramBot ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".botstart()", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt")))).contains("TelegramBot ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							TelegramBot = line1.replace(m1.group(), "");
							TelegramBot = TelegramBot.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/".concat("TelegramBot.txt")))).contains("TelegramBot ".concat(TelegramBot.concat(";")))) {
								if (StopLine.equals("")) {
									if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("token"))))) {
										tokenbot = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("token"))));
									}
									else {
										
									}
									if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("message"))))) {
										messagebot = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("message"))));
									}
									else {
										
									}
									if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("groupuser"))))) {
										groupuser = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/TelegramBot/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("groupuser"))));
									}
									else {
										
									}
									req.startRequestNetwork(RequestNetworkController.POST, "https://api.telegram.org/bot".concat(tokenbot.concat("/sendMessage?chat_id=".concat(groupuser.concat("&text=".concat(messagebot))))), "Telegram", _req_request_listener);
								}
							}
							else {
								_erorr2("botstart", error, "لم يتم العثور على ".concat(TelegramBot.concat("\nاو لم تقم بانشاء TelegramBot")));
							}
						}
						else {
							_erorr2("botstart", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("botstart", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _IntentWeb() {
		if (saveline.contains("IntentWeb")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace("IntentWeb", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("IntentWeb", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										if (StopLine.equals("")) {
											intent.setAction(Intent.ACTION_VIEW);
											intent.setData(Uri.parse(m3.group()));
											m.startActivity(intent);
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										intent.setAction(Intent.ACTION_VIEW);
										intent.setData(Uri.parse(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))));
										m.startActivity(intent);
									}
								}
								else {
									_erorr2("IntentWeb", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("IntentWeb", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("IntentWeb", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("IntentWeb", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("IntentWeb", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _Dlbutton3() {
		if (saveline.contains(".button3")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".button3", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\{)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".button3", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\{").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\{)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button3"))), m3.group());
													AddFileString = "/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button3on")));
													Stringfile = "";
													StopLine = "2";
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button3"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
												AddFileString = "/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button3on")));
												Stringfile = "";
												StopLine = "2";
											}
										}
										else {
											_erorr2("button3", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2("button3", error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2("button3", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains("{")) {
						
					}
					else {
						_erorr2("button3", error, "الرجاء كتابة } نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_DlEditText();
		}
	}
	
	
	public static void _UnityvedeoAds() {
		if (saveline.contains("UnityRewardedAds")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace("UnityRewardedAds", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("UnityRewardedAds", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					line1 = line1.replaceAll("\\s", "");
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (m3.group().equals("") || m3.group().equals(" ")) {
										
									}
									else {
										if (saveline.contains(".true;")) {
											if (StopLine.equals("")) {
												UnityAds.initialize (m, m3.group(), false,false);
												_unityBanner();
												_UnityRewardedAds();
												if (UnityAds.isReady("Rewarded_Android")) {
														UnityAds.show(m, "Rewarded_Android");
												}
											}
										}
										else {
											if (saveline.contains(".false;")) {
												if (StopLine.equals("")) {
													UnityAds.initialize (m, m3.group(), true,false);
													_unityBanner();
													_UnityRewardedAds();
													if (UnityAds.isReady("Rewarded_Android")) {
															UnityAds.show(m, "Rewarded_Android");
													}
												}
											}
											else {
												_erorr2("UnityRewardedAds", error, "الرجاء كتابة true او false");
											}
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (saveline.contains(".true;")) {
										if (StopLine.equals("")) {
											UnityAds.initialize (m, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")), false,true);
											_unityBanner();
											_UnityRewardedAds();
											if (UnityAds.isReady("Rewarded_Android")) {
													UnityAds.show(m, "Rewarded_Android");
											}
										}
									}
									else {
										if (saveline.contains(".false;")) {
											if (StopLine.equals("")) {
												UnityAds.initialize (m, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")), false,false);
												_unityBanner();
												_UnityRewardedAds();
												if (UnityAds.isReady("Rewarded_Android")) {
														UnityAds.show(m, "Rewarded_Android");
												}
											}
										}
										else {
											_erorr2("UnityRewardedAds", error, "الرجاء كتابة true او false");
										}
									}
								}
								else {
									_erorr2("UnityRewardedAds", error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("UnityRewardedAds", error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2("UnityRewardedAds", error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2("UnityRewardedAds", error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("UnityRewardedAds", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _DIntent() {
		if (saveline.contains("Intent ")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("Intent", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\+)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("Intent ", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							erorno = m1.group().replaceAll("\\s", "");
							if (!"/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt"))).contains("Intent ".concat(erorno.concat(";")))) {
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/Intent")));
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(erorno));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).concat("\n".concat("Intent ".concat(erorno.concat(";")))));
							}
						}
						else {
							_erorr2("Intent", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("Intent", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
					_Packagename();
				}
			}
			else {
				_Packagename();
			}
		}
		else {
			_Packagename();
		}
	}
	
	
	public static void _Packagename() {
		if (saveline.contains(".PackageName")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".PackageName", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".PackageName", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							TelegramBot = line1.replace(m1.group(), "");
							TelegramBot = TelegramBot.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(TelegramBot.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("PackageName"))), m3.group());
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("PackageName"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
											}
										}
										else {
											_erorr2("PackageName", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2("PackageName", error, "لم يتم العثور على ".concat(TelegramBot.concat("\nاو لم تقم بانشاء Intent")));
							}
						}
						else {
							_erorr2("PackageName", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("PackageName", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_DActivity();
		}
	}
	
	
	public static void _DActivity() {
		if (saveline.contains(".Activity")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".Activity", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".Activity", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							TelegramBot = line1.replace(m1.group(), "");
							TelegramBot = TelegramBot.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(TelegramBot.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("Activity"))), m3.group());
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("Activity"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
											}
										}
										else {
											_erorr2("Activity", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2("Activity", error, "لم يتم العثور على ".concat(TelegramBot.concat("\nاو لم تقم بانشاء Intent")));
							}
						}
						else {
							_erorr2("Activity", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("Activity", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_Derorr();
		}
	}
	
	
	public static void _startActivity() {
		if (saveline.contains(".startActivity()")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace(".startActivity()", "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".startActivity()", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							TelegramBot = line1.replace(m1.group(), "");
							TelegramBot = TelegramBot.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(TelegramBot.concat(";")))) {
								if (StopLine.equals("")) {
									if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("PackageName"))))) {
										tokenbot = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("PackageName"))));
									}
									else {
										
									}
									if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("Activity"))))) {
										messagebot = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("Activity"))));
									}
									else {
										
									}
									
									Intent intent = new Intent();
									intent.setClassName(tokenbot, messagebot);
									PackageManager packageManager = m.getPackageManager();
									List<ResolveInfo> resolveInfoList = packageManager.queryIntentActivities(intent, 0);
									if (!resolveInfoList.isEmpty()) {
										        
										 
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("putExtra")))) && FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("putExtra1"))))) {
											intent.putExtra(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("putExtra")))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("putExtra1")))));
										}
										m.startActivity(intent);
									} else {
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("IntentErorr"))))) {
											try {
														
												StopLine = "";
												Stringfile = "";
												AddFileont = 0;
												toast = "";
												toastfil = "";
												message = "";
												title = "";
												stop = "";
												lineCounter("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("IntentErorr"))));
														} catch(Exception e) {
															
													}
										}
									}
								}
							}
							else {
								_erorr2("startActivity", error, "لم يتم العثور على ".concat(TelegramBot.concat("\nاو لم تقم بانشاء Intent")));
							}
						}
						else {
							_erorr2("startActivity", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("startActivity", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _Derorr() {
		if (saveline.contains(".IntentErorr")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace(".IntentErorr", "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".IntentErorr", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\{").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\,)(.*)(?=\\{)").matcher(line1);
								while (m2.find()) {
										
										if (StopLine.equals("")) {
										AddFileString = "/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(Dialogs.concat("/".concat(Dialogs).concat("IntentErorr")));
										Stringfile = "";
										StopLine = "2";
									}
										
								}
							}
							else {
								_erorr2("IntentErorr", error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Intent")));
							}
						}
						else {
							_erorr2("IntentErorr", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains("{")) {
						
					}
					else {
						_erorr2("IntentErorr", error, "الرجاء كتابة } نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_getactivyt();
		}
	}
	
	
	public static void _chatgpt() {
		if (saveline.contains("ChatGpt ")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("ChatGpt", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\+)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("ChatGpt ", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							erorno = m1.group().replaceAll("\\s", "");
							if (!FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt")))).contains("chatgpt ".concat(erorno.concat(";")))) {
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/chatgpt")));
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/chatgpt/")).concat(erorno));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("ChatSuccess()"))), "حدث خطاء الرجاء اعادة المحاولة");
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt")))).concat("\n".concat("chatgpt ".concat(erorno.concat(";")))));
							}
						}
						else {
							_erorr2("ChatGpt", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("ChatGpt", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
					_chatgptapi();
				}
			}
			else {
				_chatgptapi();
			}
		}
		else {
			_chatgptapi();
		}
	}
	
	
	public static void _chatgptapi() {
		if (saveline.contains(".API")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".API", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt")))).contains("chatgpt ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".API", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(line1);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt")))).contains("chatgpt ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							TelegramBot = line1.replace(m1.group(), "");
							TelegramBot = TelegramBot.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt")))).contains("chatgpt ".concat(TelegramBot.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("api"))), "Bearer ".concat(m3.group()));
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("api"))), "Bearer ".concat(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))));
											}
										}
										else {
											_erorr2("API", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2("API", error, "لم يتم العثور على ".concat(TelegramBot.concat("\nاو لم تقم بانشاء ChatGpt")));
							}
						}
						else {
							_erorr2("API", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					line1 = saveline;
				}
				if (saveline.contains(";")) {
					
				}
				else {
					_erorr2("API", error, "الرجاء كتابة ; نهاية الكود");
				}
			}
		}
		else {
			_chatgptmessage();
		}
	}
	
	
	public static void _chatgptmessage() {
		if (saveline.contains(".ChatGptMessage")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".ChatGptMessage", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt")))).contains("chatgpt ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".ChatGptMessage", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt")))).contains("chatgpt ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							TelegramBot = line1.replace(m1.group(), "");
							TelegramBot = TelegramBot.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt")))).contains("chatgpt ".concat(TelegramBot.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("message"))), m3.group());
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat("message"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
											}
										}
										else {
											_erorr2("ChatGptMessage", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2("ChatGptMessage", error, "لم يتم العثور على ".concat(TelegramBot.concat("\nاو لم تقم بانشاء ChatGpt")));
							}
						}
						else {
							_erorr2("ChatGptMessage", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("ChatGptMessage", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_chatgptSuccess();
		}
	}
	
	
	public static void _chatgptstart() {
		if (saveline.contains(".ChatGptStart()")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace(".ChatGptStart()", "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt")))).contains("chatgpt ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".ChatGptStart()", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt")))).contains("chatgpt ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							ChatGpt = line1.replace(m1.group(), "");
							ChatGpt = ChatGpt.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt")))).contains("chatgpt ".concat(ChatGpt.concat(";")))) {
								if (StopLine.equals("")) {
									if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/")).concat(ChatGpt.concat("/".concat(ChatGpt).concat("api"))))) {
										tokenbot = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/")).concat(ChatGpt.concat("/".concat(ChatGpt).concat("api"))));
									}
									else {
										
									}
									if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/")).concat(ChatGpt.concat("/".concat(ChatGpt).concat("message"))))) {
										messagebot = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/")).concat(ChatGpt.concat("/".concat(ChatGpt).concat("message"))));
									}
									else {
										
									}
									chatgptmap.put("Content-Type", "application/json");
									chatgptmap.put("Authorization", tokenbot);
									reqt.setHeaders(chatgptmap);
									chatgptmap2.put("model", "text-davinci-003");
									chatgptmap2.put("prompt", messagebot);
									chatgptmap2.put("max_tokens", (int)(4000));
									chatgptmap2.put("temperature", (double)(0.4d));
									reqt.setParams(chatgptmap2, RequestNetworkController.REQUEST_BODY);
									reqt.startRequestNetwork(RequestNetworkController.POST, "https://api.openai.com/v1/completions", "", _reqt_request_listener);
								}
							}
							else {
								_erorr2("ChatGptStart", error, "لم يتم العثور على ".concat(ChatGpt.concat("\nاو لم تقم بانشاء ChatGpt")));
							}
						}
						else {
							_erorr2("ChatGptStart", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("ChatGptStart", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _chatgptSuccess() {
		if (saveline.contains(".ChatGptSuccess")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace(".ChatGptSuccess", "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt")))).contains("chatgpt ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".ChatGptSuccess", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(line1);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt")))).contains("chatgpt ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\{").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/chatgpt/".concat("chatgpt.txt")))).contains("chatgpt ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\,)(.*)(?=\\{)").matcher(line1);
								while (m2.find()) {
										
										if (StopLine.equals("")) {
										AddFileString = "/data/user/0/".concat(pkgapp.concat("/chatgpt/")).concat(Dialogs.concat("/".concat(Dialogs).concat("chatgptSuccess")));
										Stringfile = "";
										StopLine = "2";
									}
										
								}
							}
							else {
								_erorr2("ChatGptSuccess", error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء ChatGpt")));
							}
						}
						else {
							_erorr2("ChatGptSuccess", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
					if (saveline.contains("{")) {
						
					}
					else {
						_erorr2("ChatGptSuccess", error, "الرجاء كتابة } نهاية الكود");
					}
				}
				else {
					line1 = saveline;
				}
			}
		}
		else {
			_chatgptstart();
		}
	}
	
	
	public static void _DlEditText() {
		if (saveline.contains(".edittext")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace(".edittext", "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				nu = line1;
				nu = nu.replaceAll("\\s", "");
				line1 = line1.replace(".edittext", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m3 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m3.find()) {
										
										toast = m3.group().replaceAll("\\s", "");
									if (toast.equals("")) {
										if (StopLine.equals("")) {
											if (nu.contains(".number")) {
												if (nu.contains(".number;")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("edittextnu"))), "true");
												}
												else {
													_erorr2("edittext", error, "لم يتم العثور على ".concat(".number"));
												}
											}
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Dialogs.concat(".getText()")), "حدث مشكلة");
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("edittext"))), "true");
										}
									}
									else {
										_erorr2("edittext", error, "لم يتم العثور على ".concat(m3.group()));
									}
										
								}
							}
							else {
								_erorr2("edittext", error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2("edittext", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("edittext", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_setError3();
		}
	}
	
	
	public static void _publicdrive() {
		if (saveline.contains("public") && saveline.contains("{")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("public", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\+)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace("public", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(line1);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\{").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = m1.group().replace(",", "");
							Dialogs = Dialogs.replace("{", "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							Dialogs = Dialogs.replace("String", "");
							Dialogs = Dialogs.replace("(", "");
							Dialogs = Dialogs.replace(")", "");
							if (StopLine.equals("")) {
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/public")));
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/public/".concat(Dialogs))));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/public/".concat(Dialogs.concat("/".concat(Dialogs))))), "");
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/public/".concat("public.txt"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/public/".concat("public.txt")))).concat("\n".concat("public ".concat(Dialogs.concat(";")))));
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(line1);
								while (m2.find()) {
										
										if (!m2.group().equals("")) {
										TelegramBot = m2.group().replaceAll("\\s", "");
										if (TelegramBot.equals("String")) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Dialogs.concat(".toString()")))), "");
												AddFileString = "/data/user/0/".concat(pkgapp.concat("/public/".concat(Dialogs.concat("/".concat(Dialogs)))));
												Stringfile = "";
												StopLine = "2";
											}
										}
									}
									else {
										if (StopLine.equals("")) {
											AddFileString = "/data/user/0/".concat(pkgapp.concat("/public/".concat(Dialogs.concat("/".concat(Dialogs)))));
											Stringfile = "";
											StopLine = "2";
										}
									}
										
								}
							}
						}
						else {
							_erorr2("public", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
					if (saveline.contains("{")) {
						
					}
					else {
						_erorr2("public", error, "الرجاء كتابة } نهاية الكود");
					}
					if (saveline.contains("(")) {
						
					}
					else {
						_erorr2("public", error, "الرجاء كتابة ) وتحقق من صحت الكود");
					}
					if (saveline.contains(")")) {
						
					}
					else {
						_erorr2("public", error, "الرجاء كتابة ( وتحقق من صحت الكود");
					}
				}
				else {
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
	
	
	public static void _erorr2(final String _asm, final double _erorr, final String _sa) {
		if (stop.equals("")) {
			stop = "kgdn";
			d.setTitle("خطاء");
			d.setMessage("يوجد خطاء في سطر ".concat(String.valueOf((long)(_erorr)).concat("\n".concat(_sa).concat("\n".concat("الخطاء في ".concat(_asm))))));
			d.setPositiveButton("حسناً", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			d.create().show();
		}
	}
	
	
	public static void _getText() {
		if (saveline.contains(".getText")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".getText", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(".getText", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													edvi = m3.group();
																								int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																								View view = m.findViewById(resourceId);
																								
																								if (view instanceof TextView) {
																										    TextView textView = (TextView) view;
																										    
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), textView.getText().toString());
																										
																								} else if (view instanceof Button) {
																										    Button button = (Button) view;
																										    
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), button.getText().toString());
																										
																								} else if (view instanceof EditText) {
																										    EditText editText = (EditText) view;
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), editText.getText().toString());
																										
																								} else if (view instanceof CheckBox) {
																										    CheckBox checkBox = (CheckBox) view;
																										    
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), checkBox.getText().toString());
																										
																								} else if (view instanceof RadioButton) {
																										    RadioButton radioButton = (RadioButton) view;
																										    
																										 
																										    
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), radioButton.getText().toString());
																								} else if (view instanceof Switch) {
																										    Switch switchView = (Switch) view;
																										    
																										
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), switchView.getText().toString());
																								} else {
																										    // يتم التعامل مع الحالة إذا كان العنصر ليس من أحد الأنواع المذكورة أعلاه
																								}
																								
																							
																						
																							
																					
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										Dialogs = m2.group().replaceAll("\\s", "");
										if (FileUtil.isDirectory("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs))) {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
												if (StopLine.equals("")) {
													edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
																								int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																								View view = m.findViewById(resourceId);
																								
																								if (view instanceof TextView) {
																										    TextView textView = (TextView) view;
																										    
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), textView.getText().toString());
																										
																								} else if (view instanceof Button) {
																										    Button button = (Button) view;
																										    
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), button.getText().toString());
																										
																								} else if (view instanceof EditText) {
																										    EditText editText = (EditText) view;
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), editText.getText().toString());
																										
																								} else if (view instanceof CheckBox) {
																										    CheckBox checkBox = (CheckBox) view;
																										    
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), checkBox.getText().toString());
																										
																								} else if (view instanceof RadioButton) {
																										    RadioButton radioButton = (RadioButton) view;
																										    
																										 
																										    
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), radioButton.getText().toString());
																								} else if (view instanceof Switch) {
																										    Switch switchView = (Switch) view;
																										    
																										
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), switchView.getText().toString());
																								} else {
																										    // يتم التعامل مع الحالة إذا كان العنصر ليس من أحد الأنواع المذكورة أعلاه
																								}
																								
																							
																						
																							
																					
												}
											}
										}
										else {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (StopLine.equals("")) {
													edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
																								int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																								View view = m.findViewById(resourceId);
																								
																								if (view instanceof TextView) {
																										    TextView textView = (TextView) view;
																										    
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), textView.getText().toString());
																										
																								} else if (view instanceof Button) {
																										    Button button = (Button) view;
																										    
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), button.getText().toString());
																										
																								} else if (view instanceof EditText) {
																										    EditText editText = (EditText) view;
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), editText.getText().toString());
																										
																								} else if (view instanceof CheckBox) {
																										    CheckBox checkBox = (CheckBox) view;
																										    
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), checkBox.getText().toString());
																										
																								} else if (view instanceof RadioButton) {
																										    RadioButton radioButton = (RadioButton) view;
																										    
																										 
																										    
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), radioButton.getText().toString());
																								} else if (view instanceof Switch) {
																										    Switch switchView = (Switch) view;
																										    
																										
																										
																										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), switchView.getText().toString());
																								} else {
																										    // يتم التعامل مع الحالة إذا كان العنصر ليس من أحد الأنواع المذكورة أعلاه
																								}
																								
																							
																						
																							
																					
												}
											}
											else {
												_erorr2("getText", error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
									}
										
								}
							}
							else {
								if (getno.contains("getText()")) {
									
								}
								else {
									_erorr2("getText", error, "لم يتم العثور على ".concat(Stringck.concat("\nاو لم تقم بانشاء String")));
								}
							}
						}
						else {
							_erorr2("getText", error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("getText", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
	
	
	public static void _erorrnov(final double _nopublicnuber, final String _line) {
		if (stop.equals("")) {
			stop = "gg";
			d.setTitle("خطاء");
			d.setMessage("يوجد خطاء في سطر ".concat(String.valueOf((long)(_nopublicnuber)).concat("\n".concat("لم يتم التعرف على هذا الكود ".concat(_line)))));
			d.setPositiveButton("حسناً", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			d.create().show();
		}
	}
	
	
	public static void _Ripple_Drawable(final View _view, final String _c) {
		android.content.res.ColorStateList clr = new android.content.res.ColorStateList(new int[][]{new int[]{}},new int[]{Color.parseColor(_c)}); android.graphics.drawable.RippleDrawable ripdr = new android.graphics.drawable.RippleDrawable(clr, null, null); _view.setBackground(ripdr);
	}
	
	
	public static void _intcr() {
		if (saveline.contains("int ")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("int ", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				linestring = line1;
				linestring = linestring.replace("int ", ",");
				lineck = linestring;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					s = "jjfjrj";
					if (linestring.contains("=")) {
						Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\=)").matcher(linestring);
						while (m1.find()) {
								
								createString = m1.group().replaceAll("\\s", "");
							Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(saveline);
							while (m2.find()) {
									
									if (createString.equals("")) {
									_erorr2("int", error, "الرجاء كتابة اسم الى int");
								}
								else {
									String regex = "^[0-9]+$";
									
									     
									toast = m2.group().replaceAll("\\s", "");
									if (toast.matches(regex)) {
										FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/int/")));
										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(createString))), m2.group());
										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData")))).concat("\n".concat("int ".concat(createString.concat(";")))));
									}
									else {
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
											toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""));
											if (toast.matches(regex)) {
												FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/int/")));
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(createString))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group())))));
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData")))).concat("\n".concat("int ".concat(createString.concat(";")))));
											}
											else {
												FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/int/")));
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(createString))), "");
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData")))).concat("\n".concat("int ".concat(createString.concat(";")))));
											}
										}
										else {
											_erorr2("int", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
								}
									
							}
								
						}
						if (saveline.contains("=")) {
							
						}
						else {
							if (stop.equals("")) {
								_erorr2("int", error, "الرجاء كتابة = وتحقق من صحت الكود");
							}
							else {
								
							}
						}
					}
					else {
						Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(linestring);
						while (m1.find()) {
								
								createString = m1.group().replaceAll("\\s", "");
							FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/int/")));
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(createString))), "");
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData")))).concat("\n".concat("int ".concat(createString.concat(";")))));
								
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("int", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			if (saveline.contains("=")) {
				
				ck = line1;
				Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
				while (m100018000.find()) {
						
						ck = ck.replace(m100018000.group(), "");
					ck = ck.replace("=", "");
					ck = ck.replace(";", "");
					ck = ck.replaceAll("\\s", "");
					if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))))) {
						ck = "";
					}
						
				}
				if (ck.equals("")) {
					Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(saveline);
					while (m2.find()) {
							
							createString = saveline.replace(m2.group(), "");
						createString = createString.replace(";", "");
						createString = createString.replace("=", "");
						createString = createString.replaceAll("\\s", "");
						s = "mdmdkdkd";
						toast = m2.group().replaceAll("\\s", "");
						String regex = "^[0-9]+$";
						
						     
						if (toast.matches(regex)) {
							FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/int/")));
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(createString))), m2.group());
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData")))).concat("\n".concat("int ".concat(createString.concat(";")))));
						}
						else {
							if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
								toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""));
								if (toast.matches(regex)) {
									FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/int/")));
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(createString))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group())))));
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData")))).concat("\n".concat("int ".concat(createString.concat(";")))));
								}
								else {
									FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/int/")));
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(createString))), "");
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData")))).concat("\n".concat("int ".concat(createString.concat(";")))));
								}
							}
							else {
								_erorr2("int", error, "لم يتم العثور على ".concat(m2.group()));
							}
						}
							
					}
				}
			}
			else {
				if (saveline.contains("++")) {
					
					ck = line1;
					ck = ck.replace("++", "=");
					Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
					while (m2.find()) {
							
							ck = ck.replace(";", "");
						ck = ck.replaceAll("\\s", "");
						ck = ck.replace("=", "");
						if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))))) {
							s = "mddmmdmd";
							int mn=0;
							mn = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck)))));
							mn++;
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))), String.valueOf((long)(mn)));
						}
							
					}
				}
				else {
					if (saveline.contains("--")) {
						
						ck = line1;
						ck = ck.replace("--", "=");
						Matcher m2 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
						while (m2.find()) {
								
								ck = ck.replace(";", "");
							ck = ck.replaceAll("\\s", "");
							ck = ck.replace("=", "");
							if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))))) {
								s = "dndjrjdi";
								int mn=0;
								mn = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck)))));
								mn--;
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))), String.valueOf((long)(mn)));
							}
								
						}
					}
					else {
						
					}
				}
			}
		}
	}
	
	
	public static void _IntToString() {
		if (saveline.contains("IntToString")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("IntToString", "+");
			ck = ":".concat(ck);
			Matcher m1 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m1.find()) {
					
					ck = ck.replace(m1.group(), "");
				if (!m1.group().equals("")) {
					Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
					while (m100018000.find()) {
							
							Stringck = m100018000.group().replace(")", "");
						Stringck = Stringck.replaceAll("\\s", "");
						if (FileUtil.isExistFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(Stringck))))) {
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("IntToString(".concat(Stringck.concat(")"))))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(Stringck)))));
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/StringData")), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/StringData"))).concat("\n".concat("String ".concat("IntToString(".concat(Stringck.concat(")")).concat(";")))));
						}
						else {
							_erorr2("IntToString", error, "لم يتم العثور على ".concat(Stringck.concat("\nاو لم تقم بانشاء int")));
						}
							
					}
				}
				else {
					_erorr2("IntToString", error, "الرجاء تحقق من الكود صحيح");
				}
					
			}
		}
		else {
			
		}
	}
	
	
	public static void _TextViewcr() {
		if (saveline.contains("TextView")) {
			dl = "TextView";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\+)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				lineck = line1.replace(dl, ",");
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							erorno = m1.group().replaceAll("\\s", "");
							if (!FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(erorno.concat(";")))) {
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/View")));
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).concat("\n".concat("View ".concat(erorno.concat(";")))));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat(dl)))), "true");
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat("id")))), String.valueOf((long)(in)));
								final TextView textView= new TextView(m);
								        textView.setPadding(8, 8, 8, 8);  
								   textv.add(textView);
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(erorno.concat(".getText()")))), textView.getText().toString());
								in++;
								if (StopLine.equals("")) {
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat("mo")))), "true");
								}
							}
							else {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat("mo")))))) {
									_erorr2(dl, error, "الرجاء تغير الاسم لان الاسم مستخدم من قبل عنصر اخر");
								}
							}
						}
						else {
							_erorr2(dl, error, "الرجاء كتابة اسم لل".concat(dl));
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابه ; نهاية الكود");
					}
					line1 = saveline;
					_TextVewSetText();
				}
			}
			else {
				_TextVewSetText();
			}
		}
		else {
			_TextVewSetText();
		}
	}
	
	
	public static void _TextVewSetText() {
		if (saveline.contains(".setText")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".setText", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(".setText(")) {
					line1 = line1.replace(".setText", ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
													cks = "setText";
													cke = m3.group();
													_text();
												}
												else {
													_erorr2("setText", error, "حدث خطاء الرجاء تحقق من صحت الكود");
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
													cks = "setText";
													cke = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
													_text();
												}
												else {
													_erorr2("setText", error, "حدث خطاء الرجاء تحقق من صحت الكود");
												}
											}
											else {
												_erorr2("setText", error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2("setText", error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل Dialog"))));
								}
							}
							else {
								_erorr2("setText", error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2("setText", error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2("setText", error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2("setText", error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_setTextColortc();
				}
			}
		}
		else {
			_setTextColortc();
		}
	}
	
	
	public static void _addtextview() {
		if (saveline.contains(".addView")) {
			dl = ".addView";			
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m1002000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m1002000.find()) {
					
					ck = ck.replace(m1002000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("TextView"))))) {
									if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
										TextView textView = textv.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));
										Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
										while (m2.find()) {
												
												if (m2.group().contains("\"")) {
												Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
												while (m3.find()) {
														
														if (m3.group().equals("") || m3.group().equals(" ")) {
														
													}
													else {
														if (StopLine.equals("")) {
															edvi = m3.group();
															int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
															final ViewGroup view = m.findViewById(resourceId);
															myList.add(m3.group());
															textViewsList.add(textView);
															if (inte == 0) {
																View textView1 = textViewsList.get(0);
																view.addView(textView1);
															}
															else {
																if ((inte == 1) || (inte > 1)) {
																	int b = (int) inte;
																	View textView1 = textViewsList.get(b);
																	view.addView(textView1);
																}
															}
															inte++;
														}
													}
														
												}
											}
											else {
												stoperror = "dsdd";
												if (FileUtil.isDirectory("/data/user/0/".concat(pkgapp.concat("/View/".concat(m2.group()))).replaceAll("\\s", ""))) {
													no = m2.group().replaceAll("\\s", "");
													if (StopLine.equals("")) {
														if (FileUtil.isExistFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr"))))) {
															line = new Gson().fromJson(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr")))), new TypeToken<ArrayList<String>>(){}.getType());
														}
														else {
															line.clear();
														}
														textline.add(textView);
														line.add(String.valueOf((long)(intview)));
														FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr"))), new Gson().toJson(line));
														intview++;
													}
												}
												else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
														if (StopLine.equals("")) {
															edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
															int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
															final ViewGroup view = m.findViewById(resourceId);
															
															myList.add(edvi);
															textViewsList.add(textView);
															if (inte == 0) {
																View textView1 = textViewsList.get(0);
																view.addView(textView1);
															}
															else {
																if ((inte == 1) || (inte > 1)) {
																	int b = (int) inte;
																	View textView1 = textViewsList.get(b);
																	view.addView(textView1);
																}
															}
															inte++;
														}
													}
													else {
														_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
													}
												}
											}
												
										}
									}
									else {
										_erorr2("setText", error, "حدث خطاء الرجاء تحقق من صحت الكود");
									}
								}
								_edittextck();
							}
							else {
								_erorr2(dl, error, "لم يتم العثور على ".concat(Dialogs));
							}
						}
						else {
							_erorr2(dl, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
					if (saveline.contains(")")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة (");
					}
					if (saveline.contains("(")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة )");
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _setTextColortc() {
		if (saveline.contains(".setTextColor")) {
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(".setTextColor", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".setTextColor", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
													cks = "setTextColor";
													cke = m3.group();
													_text();
													
												}
												else {
													_erorr2("setTexColor", error, "حدث خطاء الرجاء تحقق من صحت الكود");
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
												cks = "setTextColor";
												cke = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
												_text();
											}
											else {
												_erorr2("setTextColor", error, "حدث خطاء الرجاء تحقق من صحت الكود");
											}
											
										}
										else {
											_erorr2("setTextColor", error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2("setTextColor", error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل Dialog"))));
							}
						}
						else {
							_erorr2("setTextColor", error, "الرجاء تحقق من الكود");
						}
							
					}
					if (saveline.contains(")")) {
						
					}
					else {
						_erorr2("setTextColor", error, "الرجاء كتابة (");
					}
					if (saveline.contains("(")) {
						
					}
					else {
						_erorr2("setTextColor", error, "الرجاء كتابة )");
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2("setTextColor", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_setTextSize();
		}
	}
	
	
	public static void _setTextSize() {
		if (saveline.contains(".setTextSize")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace(".setTextSize", "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(".setTextSize", ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
								Matcher m4 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m4.find()) {
										
										if (!m4.group().equals("")) {
										String regex = "^[0-9]+$";
										
										     
										toast = m4.group().replaceAll("\\s", "");
										if (toast.matches(regex)) {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
												cks = "setTextSize";
												cke = m4.group();
												_text();
											}
											else {
												_erorr2("setTextSize", error, "حدث خطاء الرجاء تحقق من صحت الكود");
											}
										}
										else {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m4.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
													cks = "setTextSize";
													cke = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m4.group()))).replaceAll("\\s", ""));
													_text();
												}
												else {
													_erorr2("setTextSize", error, "حدث خطاء الرجاء تحقق من صحت الكود");
												}
											}
											else {
												_erorr2(".setTextSize", error, "لم يتم العثور على ".concat(m4.group()));
											}
										}
									}
									else {
										_erorr2(".setTextSize", error, "الرجاء كتابة حجم النص");
									}
										
								}
							}
							else {
								_erorr2(".setTextSize", error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل Dialog"))));
							}
						}
						else {
							_erorr2(".setTextSize", error, "الرجاء تحقق من الكود");
						}
							
					}
					if (saveline.contains(")")) {
						
					}
					else {
						_erorr2(".setTextSize", error, "الرجاء كتابة (");
					}
					if (saveline.contains("(")) {
						
					}
					else {
						_erorr2(".setTextSize", error, "الرجاء كتابة )");
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(".setTextSize", error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_setedittext();
		}
	}
	
	
	public static void _EditText2() {
		if (saveline.contains("EditText")) {
			dl = "EditText";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\+)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				lineck = line1.replace(dl, ",");
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							erorno = m1.group().replaceAll("\\s", "");
							if (!FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(erorno.concat(";")))) {
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/View")));
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).concat("\n".concat("View ".concat(erorno.concat(";")))));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat(dl)))), "true");
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat("id")))), String.valueOf((long)(in2)));
								final EditText textView= new EditText(m);
								        textView.setPadding(8, 8, 8, 8);  
								   textv2.add(textView);
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(erorno.concat(".getText()")))), textView.getText().toString());
								in2++;
								if (StopLine.equals("")) {
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat("mo")))), "true");
								}
							}
							else {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat("mo")))))) {
									_erorr2(dl, error, "الرجاء كتابة اسم لل".concat(dl));
								}
							}
						}
						else {
							_erorr2(dl, error, "الرجاء كتابة اسم للDialog");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابه ; نهاية الكود");
					}
					line1 = saveline;
					_TextVewSetText();
				}
			}
			else {
				_TextVewSetText();
			}
		}
		else {
			_TextVewSetText();
		}
	}
	
	
	public static void _setedittext() {
		if (saveline.contains(".setHint")) {
			dl = ".setHint";
			fg = "setHint";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
													cks = "setHint";
													cke = m3.group();
													_text();
												}
												else {
													_erorr2("setHint", error, "حدث خطاء الرجاء تحقق من صحت الكود");
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
													cks = "setHint";
													cke = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
													_text();
												}
												else {
													_erorr2("setHint", error, "حدث خطاء الرجاء تحقق من صحت الكود");
												}
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_colorhint();
				}
			}
		}
		else {
			_colorhint();
		}
	}
	
	
	public static void _edittextck() {
		if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("EditText"))))) {
			if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
				EditText textView = textv2.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));
				final String d=Dialogs;
				textView.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String _charSeq = _param1.toString();
									
							
						Dialogs = d;
						FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Dialogs.concat(".getText()")))), _charSeq);
							}
								
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										
								}
								
								@Override
								public void afterTextChanged(Editable _param1) {
										
								}
						});
				Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
				while (m2.find()) {
						
						if (m2.group().contains("\"")) {
						Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
						while (m3.find()) {
								
								if (m3.group().equals("") || m3.group().equals(" ")) {
								
							}
							else {
								if (StopLine.equals("")) {
									edvi = m3.group();
									int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
									final ViewGroup view = m.findViewById(resourceId);
									myList.add(m3.group());
									textViewsList.add(textView);
									if (inte == 0) {
										View textView1 = textViewsList.get(0);
										view.addView(textView1);
									}
									else {
										if ((inte == 1) || (inte > 1)) {
											int b = (int) inte;
											View textView1 = textViewsList.get(b);
											view.addView(textView1);
										}
									}
									inte++;
								}
							}
								
						}
					}
					else {
						stoperror = "dsdd";
						if (FileUtil.isDirectory("/data/user/0/".concat(pkgapp.concat("/View/".concat(m2.group()))).replaceAll("\\s", ""))) {
							if (StopLine.equals("")) {
								no = m2.group().replaceAll("\\s", "");
								if (StopLine.equals("")) {
									if (FileUtil.isExistFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr"))))) {
										line = new Gson().fromJson(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr")))), new TypeToken<ArrayList<String>>(){}.getType());
									}
									else {
										line.clear();
									}
									textline.add(textView);
									line.add(String.valueOf((long)(intview)));
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr"))), new Gson().toJson(line));
									intview++;
								}
							}
						}
						else {
							if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
								if (StopLine.equals("")) {
									edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
									final ViewGroup view = m.findViewById(resourceId);
									
									myList.add(edvi);
									textViewsList.add(textView);
									if (inte == 0) {
										View textView1 = textViewsList.get(0);
										view.addView(textView1);
									}
									else {
										if ((inte == 1) || (inte > 1)) {
											int b = (int) inte;
											View textView1 = textViewsList.get(b);
											view.addView(textView1);
										}
									}
									inte++;
								}
							}
							else {
								_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
							}
						}
					}
						
				}
			}
			else {
				_erorr2("setText", error, "حدث خطاء الرجاء تحقق من صحت الكود");
			}
		}
		_buttoned();
	}
	
	
	public static void _colorhint() {
		if (saveline.contains(".setHintTextColor")) {
			dl = ".setHintTextColor";
			fg = "setHintTextColor";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													if (m3.group().equals("") || m3.group().equals(" ")) {
													
												}
												else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
														cks = "setHintTextColor";
														cke = m3.group();
														_text();
													}
													else {
														_erorr2("setHintTextColor", error, "حدث خطاء الرجاء تحقق من صحت الكود");
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
													cks = "setHintTextColor";
													cke = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
													_text();
												}
												else {
													_erorr2("setHintTextColor", error, "حدث خطاء الرجاء تحقق من صحت الكود");
												}
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_onclicv();
				}
			}
		}
		else {
			_onclicv();
		}
	}
	
	
	public static void _onclicv() {
		if (saveline.contains(".onClick")) {
			dl = ".onClick";
			fg = "onClick";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\{").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
								if (StopLine.equals("")) {
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat(fg))), "true");
									OnClick2 = "/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat(fg.concat("on"))));
									Stringfile = "";
									StopLine = "6";
									onclick = Dialogs;
								}
							}
							else {
								_erorr2(dl, error, "لم يتم العثور على ".concat(Dialogs));
							}
						}
						else {
							_erorr2(dl, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains("{")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة } نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_Button2();
		}
	}
	
	
	public static void _buttoned() {
		if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("Button"))))) {
			if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
				Button textView = textv1.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));
				Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
				while (m2.find()) {
						
						if (m2.group().contains("\"")) {
						Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
						while (m3.find()) {
								
								if (m3.group().equals("") || m3.group().equals(" ")) {
								
							}
							else {
								if (StopLine.equals("")) {
									edvi = m3.group();
									int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
									final ViewGroup view = m.findViewById(resourceId);
									myList.add(m3.group());
									textViewsList.add(textView);
									if (inte == 0) {
										View textView1 = textViewsList.get(0);
										view.addView(textView1);
									}
									else {
										if ((inte == 1) || (inte > 1)) {
											int b = (int) inte;
											View textView1 = textViewsList.get(b);
											view.addView(textView1);
										}
									}
									inte++;
								}
							}
								
						}
					}
					else {
						stoperror = "dsdd";
						if (FileUtil.isDirectory("/data/user/0/".concat(pkgapp.concat("/View/".concat(m2.group()))).replaceAll("\\s", ""))) {
							no = m2.group().replaceAll("\\s", "");
							if (StopLine.equals("")) {
								if (FileUtil.isExistFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr"))))) {
									line = new Gson().fromJson(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr")))), new TypeToken<ArrayList<String>>(){}.getType());
								}
								else {
									line.clear();
								}
								textline.add(textView);
								line.add(String.valueOf((long)(intview)));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr"))), new Gson().toJson(line));
								intview++;
							}
						}
						else {
							if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
								if (StopLine.equals("")) {
									edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
									final ViewGroup view = m.findViewById(resourceId);
									
									myList.add(edvi);
									textViewsList.add(textView);
									if (inte == 0) {
										View textView1 = textViewsList.get(0);
										view.addView(textView1);
									}
									else {
										if ((inte == 1) || (inte > 1)) {
											int b = (int) inte;
											View textView1 = textViewsList.get(b);
											view.addView(textView1);
										}
									}
									inte++;
								}
							}
							else {
								_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
							}
						}
					}
						
				}
			}
			else {
				_erorr2("setText", error, "حدث خطاء الرجاء تحقق من صحت الكود");
			}
		}
		_linear();
	}
	
	
	public static void _Button2() {
		if (saveline.contains("Button")) {
			dl = "Button";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\+)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				lineck = line1.replace(dl, ",");
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							erorno = m1.group().replaceAll("\\s", "");
							if (!FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(erorno.concat(";")))) {
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/View")));
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).concat("\n".concat("View ".concat(erorno.concat(";")))));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat(dl)))), "true");
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat("id")))), String.valueOf((long)(in1)));
								final Button textView= new Button(m);
								        
								        textView.setPadding(8, 8, 8, 8);  
								   textv1.add(textView);
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(erorno.concat(".getText()")))), textView.getText().toString());
								in1++;
								if (StopLine.equals("")) {
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat("mo")))), "true");
								}
							}
							else {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat("mo")))))) {
									_erorr2(dl, error, "الرجاء تغير الاسم لان الاسم مستخدم من قبل عنصر اخر");
								}
							}
						}
						else {
							_erorr2(dl, error, "الرجاء كتابة اسم لل".concat(dl));
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابه ; نهاية الكود");
					}
					line1 = saveline;
					_LinearLayout2();
				}
			}
			else {
				_LinearLayout2();
			}
		}
		else {
			_LinearLayout2();
		}
	}
	
	
	public static void _linear() {
		if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("LinearLayout"))))) {
			if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
				LinearLayout textView = textv3.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));
				    
				if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("tr"))))) {
					int im =0;
					line = new Gson().fromJson(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("tr")))), new TypeToken<ArrayList<String>>(){}.getType());
					if (!line.isEmpty()) {
						for(int _repeat810 = 0; _repeat810 < (int)(line.size()); _repeat810++) {
							String stringValue = line.get(im);
							int intValue = Integer.parseInt(stringValue);
							View textVie = textline.get(intValue);
							textView.addView(textVie);
							im++;
						}
					}
				}
				Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
				while (m2.find()) {
						
						if (m2.group().contains("\"")) {
						Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
						while (m3.find()) {
								
								if (m3.group().equals("") || m3.group().equals(" ")) {
								
							}
							else {
								if (StopLine.equals("")) {
									edvi = m3.group();
									int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
									final ViewGroup view = m.findViewById(resourceId);
									myList.add(m3.group());
									textViewsList.add(textView);
									if (inte == 0) {
										View textView1 = textViewsList.get(0);
										view.addView(textView1);
									}
									else {
										if ((inte == 1) || (inte > 1)) {
											int b = (int) inte;
											View textView1 = textViewsList.get(b);
											view.addView(textView1);
										}
									}
									inte++;
								}
							}
								
						}
					}
					else {
						no = m2.group().replaceAll("\\s", "");
						if (no.equals("ContentView()")) {
							m.setContentView(textView);
						}
						else {
							if (FileUtil.isDirectory("/data/user/0/".concat(pkgapp.concat("/View/".concat(m2.group()))).replaceAll("\\s", ""))) {
								no = m2.group().replaceAll("\\s", "");
								if (StopLine.equals("")) {
									if (FileUtil.isExistFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr"))))) {
										line = new Gson().fromJson(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr")))), new TypeToken<ArrayList<String>>(){}.getType());
									}
									else {
										line.clear();
									}
									textline.add(textView);
									line.add(String.valueOf((long)(intview)));
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr"))), new Gson().toJson(line));
									intview++;
								}
							}
							else {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
										int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
										final ViewGroup view = m.findViewById(resourceId);
										
										myList.add(edvi);
										textViewsList.add(textView);
										if (inte == 0) {
											View textView1 = textViewsList.get(0);
											view.addView(textView1);
										}
										else {
											if ((inte == 1) || (inte > 1)) {
												int b = (int) inte;
												View textView1 = textViewsList.get(b);
												view.addView(textView1);
											}
										}
										inte++;
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
						}
					}
						
				}
			}
			else {
				_erorr2("setText", error, "حدث خطاء الرجاء تحقق من صحت الكود");
			}
		}
	}
	
	
	public static void _LinearLayout2() {
		if (saveline.contains("LinearLayout")) {
			dl = "LinearLayout";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\+)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				lineck = line1.replace(dl, ",");
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							erorno = m1.group().replaceAll("\\s", "");
							if (!FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(erorno.concat(";")))) {
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/View")));
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).concat("\n".concat("View ".concat(erorno.concat(";")))));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat(dl)))), "true");
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat("id")))), String.valueOf((long)(in3)));
								final LinearLayout textView= new LinearLayout(m);
								        
								        textView.setPadding(8, 8, 8, 8);  
								   textv3.add(textView);
								in3++;
								if (StopLine.equals("")) {
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat("mo")))), "true");
								}
							}
							else {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(erorno.concat("/".concat(erorno.concat("mo")))))) {
									_erorr2(dl, error, "الرجاء تغير الاسم لان الاسم مستخدم من قبل عنصر اخر");
								}
							}
						}
						else {
							_erorr2(dl, error, "الرجاء كتابة اسم لل".concat(dl));
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابه ; نهاية الكود");
					}
					line1 = saveline;
					_belicolor();
				}
			}
			else {
				_belicolor();
			}
		}
		else {
			_belicolor();
		}
	}
	
	
	public static void _belicolor() {
		if (saveline.contains(".setBackgroundColor")) {
			dl = ".setBackgroundColor";
			fg = "setBackgroundColor";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													if (m3.group().equals("") || m3.group().equals(" ")) {
													
												}
												else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
														cks = "setBackgroundColor";
														cke = m3.group();
														_text();
													}
													else {
														_erorr2("setText", error, "حدث خطاء الرجاء تحقق من صحت الكود");
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
													cks = "setBackgroundColor";
													cke = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
													_text();
												}
												else {
													_erorr2("setText", error, "حدث خطاء الرجاء تحقق من صحت الكود");
												}
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_linewihet();
				}
			}
		}
		else {
			_linewihet();
		}
	}
	
	
	public static void _text() {
		if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("TextView"))))) {
			TextView textView1 = textv.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));
			        // تحديد العنصر الذي سيتم تطبيق التخطيط عليه
			        
			if (cks.equals("setText")) {
				if (StopLine.equals("")) {
					textView1.setText(cke);
					FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Dialogs.concat(".getText()")))), textView1.getText().toString());
				}
			}
			if (cks.equals("setTextColor")) {
				if (StopLine.equals("")) {
					edvi2 = cke;
					textView1.setTextColor(Color.parseColor(edvi2));
				}
			}
			if (cks.equals("setTextSize")) {
				if (StopLine.equals("")) {
					textView1.setTextSize((float)Integer.parseInt(cke));
				}
			}
			if (cks.equals("setClick")) {
				if (StopLine.equals("")) {
					final String te=cke;
					textView1.setOnClickListener(new View.OnClickListener() {
										@Override
										public void onClick(View _view) {
												_imports(te);
										}
								});
				}
			}
			if (cks.equals("setBackgroundColor")) {
				if (StopLine.equals("")) {
					edvi = cke;
					textView1.setBackgroundColor(Color.parseColor(edvi));
				}
			}
			if (!FileUtil.isExistFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ck"))))) {
				  layoutParams = new LinearLayout.LayoutParams(
				    ViewGroup.LayoutParams.WRAP_CONTENT, // العرض
				    ViewGroup.LayoutParams.WRAP_CONTENT); // الارتفاع // الارتفاع
				    
				    textView1.setLayoutParams(layoutParams);
				
				FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ck"))), "");
			}
			if (cks.equals("LayoutParams")) {
				if (StopLine.equals("")) {
					layoutParams = (LinearLayout.LayoutParams) textView1.getLayoutParams();
					int wrapContent =(int) cke3;
					int wrapContent2=(int)cke4;
					layoutParams.width = wrapContent; // استبدل newWidth بالقيمة الجديدة للعرض
					layoutParams.height = wrapContent2; // استبدل newHeight بالقيمة الجديدة للارتفاع
					textView1.setLayoutParams(layoutParams);
					
				}
			}
			if (cks.equals("setPadding")) {
				if (StopLine.equals("")) {
					int paddingValueInDp = (int) cke3;
					    float density = m.getResources().getDisplayMetrics().density;
					    int paddingValueInPx = (int) (paddingValueInDp * density);
					    textView1.setPadding(paddingValueInPx, paddingValueInPx, paddingValueInPx, paddingValueInPx);
				}
			}
			if (cks.equals("gravity")) {
				if (StopLine.equals("")) {
					layoutParams = (LinearLayout.LayoutParams) textView1.getLayoutParams();
					int wrapContent =(int) cke3;
					int newGravity = layoutParams.gravity | wrapContent;
					layoutParams.gravity = newGravity;
					textView1.setLayoutParams(layoutParams);
				}
			}
			if (cks.equals("setGravity")) {
				if (StopLine.equals("")) {
					int wrapContent =(int) cke4 | (int) cke3;
					int newGravity = textView1.getGravity() | wrapContent;
					textView1.setGravity(newGravity);
					
				}
			}
			if (cks.equals("weight")) {
				if (StopLine.equals("")) {
					layoutParams = (LinearLayout.LayoutParams) textView1.getLayoutParams();
					float wrapContent =(float) cke3;
					layoutParams.weight = wrapContent;
					textView1.setLayoutParams(layoutParams);
				}
			}
			if (cks.equals("ColorView")) {
				if (StopLine.equals("")) {
					_Ripple_Drawable(textView1, cke);
				}
			}
						if (cks.equals("setVisibility")) {
				if (StopLine.equals("")) {
				if (cke.equals("GONE")) {
					textView1.setVisibility(View.GONE);
				}else {
				if (cke.equals("VISIBLE")) {
					textView1.setVisibility(View.VISIBLE);
				}else {
				if (cke.equals("INVISIBLE")) {
					textView1.setVisibility(View.INVISIBLE);
				}
				}
				}
				}
			}
		}
		else {
			if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("Button"))))) {
				Button textView1 = textv1.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));
				if (cks.equals("setText")) {
					if (StopLine.equals("")) {
						textView1.setText(cke);
						FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Dialogs.concat(".getText()")))), textView1.getText().toString());
					}
				}
				if (cks.equals("setTextColor")) {
					if (StopLine.equals("")) {
						edvi2 = cke;
						textView1.setTextColor(Color.parseColor(edvi2));
					}
				}
				if (cks.equals("setTextSize")) {
					if (StopLine.equals("")) {
						textView1.setTextSize((float)Integer.parseInt(cke));
					}
				}
				if (cks.equals("setClick")) {
					if (StopLine.equals("")) {
						final String te=cke;
						textView1.setOnClickListener(new View.OnClickListener() {
											@Override
											public void onClick(View _view) {
													_imports(te);
											}
									});
					}
				}
				if (cks.equals("setBackgroundColor")) {
					if (StopLine.equals("")) {
						edvi = cke;
						textView1.setBackgroundColor(Color.parseColor(edvi));
					}
				}
				if (!FileUtil.isExistFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ck"))))) {
					  layoutParams = new LinearLayout.LayoutParams(
					    ViewGroup.LayoutParams.WRAP_CONTENT, // العرض
					    ViewGroup.LayoutParams.WRAP_CONTENT); // الارتفاع // الارتفاع
					    
					    textView1.setLayoutParams(layoutParams);
					
					FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ck"))), "");
				}
				if (cks.equals("LayoutParams")) {
					if (StopLine.equals("")) {
						layoutParams = (LinearLayout.LayoutParams) textView1.getLayoutParams();
						int wrapContent =(int) cke3;
						int wrapContent2=(int)cke4;
						layoutParams.width = wrapContent; // استبدل newWidth بالقيمة الجديدة للعرض
						layoutParams.height = wrapContent2; // استبدل newHeight بالقيمة الجديدة للارتفاع
						textView1.setLayoutParams(layoutParams);
						
					}
				}
				if (cks.equals("setPadding")) {
					if (StopLine.equals("")) {
						int paddingValueInDp = (int) cke3;
						    float density = m.getResources().getDisplayMetrics().density;
						    int paddingValueInPx = (int) (paddingValueInDp * density);
						    textView1.setPadding(paddingValueInPx, paddingValueInPx, paddingValueInPx, paddingValueInPx);
					}
				}
				if (cks.equals("gravity")) {
					if (StopLine.equals("")) {
						layoutParams = (LinearLayout.LayoutParams) textView1.getLayoutParams();
						int wrapContent =(int) cke3;
						int newGravity = layoutParams.gravity | wrapContent;
						layoutParams.gravity = newGravity;
						textView1.setLayoutParams(layoutParams);
					}
				}
				if (cks.equals("setGravity")) {
					if (StopLine.equals("")) {
						int wrapContent =(int) cke4 | (int) cke3;
						int newGravity = textView1.getGravity() | wrapContent;
						textView1.setGravity(newGravity);
						
					}
				}
				if (cks.equals("weight")) {
					if (StopLine.equals("")) {
						layoutParams = (LinearLayout.LayoutParams) textView1.getLayoutParams();
						float wrapContent =(float) cke3;
						layoutParams.weight = wrapContent;
						textView1.setLayoutParams(layoutParams);
					}
				}
				if (cks.equals("ColorView")) {
				if (StopLine.equals("")) {
					_Ripple_Drawable(textView1, cke);
				}
			}
			if (cks.equals("setVisibility")) {
				if (StopLine.equals("")) {
				if (cke.equals("GONE")) {
					textView1.setVisibility(View.GONE);
				}else {
				if (cke.equals("VISIBLE")) {
					textView1.setVisibility(View.VISIBLE);
				}else {
				if (cke.equals("INVISIBLE")) {
					textView1.setVisibility(View.INVISIBLE);
				}
				}
				}
				}
			}
			}
			else {
				if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("EditText"))))) {
					EditText textView1 = textv2.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));
					
					if (cks.equals("setText")) {
						if (StopLine.equals("")) {
							textView1.setText(cke);
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Dialogs.concat(".getText()")))), textView1.getText().toString());
						}
					}
					if (cks.equals("setTextColor")) {
						if (StopLine.equals("")) {
							edvi2 = cke;
							textView1.setTextColor(Color.parseColor(edvi2));
						}
					}
					if (cks.equals("setTextSize")) {
						if (StopLine.equals("")) {
							textView1.setTextSize((float)Integer.parseInt(cke));
						}
					}
					if (cks.equals("setHint")) {
						if (StopLine.equals("")) {
							textView1.setHint(cke);
						}
					}
					if (cks.equals("setHintTextColor")) {
						if (StopLine.equals("")) {
							edvi2 = cke;
							textView1.setHintTextColor(Color.parseColor(edvi2));
						}
					}
					if (cks.equals("setClick")) {
						if (StopLine.equals("")) {
							final String te=cke;
							textView1.setOnClickListener(new View.OnClickListener() {
												@Override
												public void onClick(View _view) {
														_imports(te);
												}
										});
						}
					}
					if (cks.equals("setBackgroundColor")) {
						if (StopLine.equals("")) {
							edvi = cke;
							textView1.setBackgroundColor(Color.parseColor(edvi));
						}
					}
					if (cks.equals("setError")) {
						if (StopLine.equals("")) {
							((EditText)textView1).setError(cke);
						}
					}
					if (!FileUtil.isExistFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ck"))))) {
						  layoutParams = new LinearLayout.LayoutParams(
						    ViewGroup.LayoutParams.WRAP_CONTENT, // العرض
						    ViewGroup.LayoutParams.WRAP_CONTENT); // الارتفاع // الارتفاع
						    
						    textView1.setLayoutParams(layoutParams);
						
						FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ck"))), "");
					}
					if (cks.equals("LayoutParams")) {
						if (StopLine.equals("")) {
							layoutParams = (LinearLayout.LayoutParams) textView1.getLayoutParams();
							int wrapContent =(int) cke3;
							int wrapContent2=(int)cke4;
							layoutParams.width = wrapContent; // استبدل newWidth بالقيمة الجديدة للعرض
							layoutParams.height = wrapContent2; // استبدل newHeight بالقيمة الجديدة للارتفاع
							textView1.setLayoutParams(layoutParams);
							
						}
					}
					if (cks.equals("setPadding")) {
						if (StopLine.equals("")) {
							int paddingValueInDp = (int) cke3;
							    float density = m.getResources().getDisplayMetrics().density;
							    int paddingValueInPx = (int) (paddingValueInDp * density);
							    textView1.setPadding(paddingValueInPx, paddingValueInPx, paddingValueInPx, paddingValueInPx);
						}
					}
					if (cks.equals("gravity")) {
						if (StopLine.equals("")) {
							layoutParams = (LinearLayout.LayoutParams) textView1.getLayoutParams();
							int wrapContent =(int) cke3;
							int newGravity = layoutParams.gravity | wrapContent;
							layoutParams.gravity = newGravity;
							textView1.setLayoutParams(layoutParams);
						}
					}
					if (cks.equals("setGravity")) {
						if (StopLine.equals("")) {
							int wrapContent =(int) cke4 | (int) cke3;
							int newGravity = textView1.getGravity() | wrapContent;
							textView1.setGravity(newGravity);
							
						}
					}
					if (cks.equals("weight")) {
						if (StopLine.equals("")) {
							layoutParams = (LinearLayout.LayoutParams) textView1.getLayoutParams();
							float wrapContent =(float) cke3;
							layoutParams.weight = wrapContent;
							textView1.setLayoutParams(layoutParams);
						}
					}
					if (cks.equals("ColorView")) {
				if (StopLine.equals("")) {
					_Ripple_Drawable(textView1, cke);
				}
			}
						if (cks.equals("setVisibility")) {
				if (StopLine.equals("")) {
				if (cke.equals("GONE")) {
					textView1.setVisibility(View.GONE);
				}else {
				if (cke.equals("VISIBLE")) {
					textView1.setVisibility(View.VISIBLE);
				}else {
				if (cke.equals("INVISIBLE")) {
					textView1.setVisibility(View.INVISIBLE);
				}
				}
				}
				}
			}
				}
				else {
					if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("LinearLayout"))))) {
						LinearLayout textView1 = textv3.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));
						if (cks.equals("setClick")) {
							if (StopLine.equals("")) {
								final String te=cke;
								textView1.setOnClickListener(new View.OnClickListener() {
													@Override
													public void onClick(View _view) {
															_imports(te);
													}
											});
							}
						}
						if (cks.equals("setBackgroundColor")) {
							if (StopLine.equals("")) {
								edvi = cke;
								textView1.setBackgroundColor(Color.parseColor(edvi));
							}
						}
						if (cks.equals("setOrientation")) {
							if (cke.equals("HORIZONTAL")) {
								if (StopLine.equals("")) {
									textView1.setOrientation(LinearLayout.HORIZONTAL);
								}
							}
							else {
								if (cke.equals("VERTICAL")) {
									if (StopLine.equals("")) {
										textView1.setOrientation(LinearLayout.VERTICAL);
									}
								}
								else {
									
								}
							}
						}
						if (cks.equals("removeAllViews")) {
							if (StopLine.equals("")) {
								textView1.removeAllViews();
							}
						}
						if (!FileUtil.isExistFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ck"))))) {
							  layoutParams = new LinearLayout.LayoutParams(
							    ViewGroup.LayoutParams.WRAP_CONTENT, // العرض
							    ViewGroup.LayoutParams.WRAP_CONTENT); // الارتفاع // الارتفاع
							    
							    textView1.setLayoutParams(layoutParams);
							
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ck"))), "");
						}
						if (cks.equals("LayoutParams")) {
							if (StopLine.equals("")) {
								layoutParams = (LinearLayout.LayoutParams) textView1.getLayoutParams();
								int wrapContent =(int) cke3;
								int wrapContent2=(int)cke4;
								layoutParams.width = wrapContent; // استبدل newWidth بالقيمة الجديدة للعرض
								layoutParams.height = wrapContent2; // استبدل newHeight بالقيمة الجديدة للارتفاع
								textView1.setLayoutParams(layoutParams);
								
							}
						}
						if (cks.equals("setPadding")) {
							if (StopLine.equals("")) {
								int paddingValueInDp = (int) cke3;
								    float density = m.getResources().getDisplayMetrics().density;
								    int paddingValueInPx = (int) (paddingValueInDp * density);
								    textView1.setPadding(paddingValueInPx, paddingValueInPx, paddingValueInPx, paddingValueInPx);
							}
						}
						if (cks.equals("gravity")) {
							if (StopLine.equals("")) {
								layoutParams = (LinearLayout.LayoutParams) textView1.getLayoutParams();
								int wrapContent =(int) cke3;
								int newGravity = layoutParams.gravity | wrapContent;
								layoutParams.gravity = newGravity;
								textView1.setLayoutParams(layoutParams);
							}
						}
						if (cks.equals("setGravity")) {
							if (StopLine.equals("")) {
								int wrapContent =(int) cke4 | (int) cke3;
								textView1.setGravity(wrapContent);
								
							}
						}
						if (cks.equals("weight")) {
							if (StopLine.equals("")) {
								layoutParams = (LinearLayout.LayoutParams) textView1.getLayoutParams();
								float wrapContent =(float) cke3;
								layoutParams.weight = wrapContent;
								textView1.setLayoutParams(layoutParams);
							}
						}
						if (cks.equals("ColorView")) {
				if (StopLine.equals("")) {
					_Ripple_Drawable(textView1, cke);
				}
			}
						if (cks.equals("setVisibility")) {
				if (StopLine.equals("")) {
				if (cke.equals("GONE")) {
					textView1.setVisibility(View.GONE);
				}else {
				if (cke.equals("VISIBLE")) {
					textView1.setVisibility(View.VISIBLE);
				}else {
				if (cke.equals("INVISIBLE")) {
					textView1.setVisibility(View.INVISIBLE);
				}
				}
				}
				}
			}
					}
					else {
						
					}
				}
			}
		}
	}
	
	
	public static void _linewihet() {
		if (saveline.contains(".setOrientation")) {
			dl = ".setOrientation";
			fg = "setOrientation";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											toast = m2.group().replaceAll("\\s", "");
										if (toast.equals("VERTICAL")) {
											cks = "setOrientation";
											cke = toast;
											_text();
										}
										else {
											if (toast.equals("HORIZONTAL")) {
												cks = "setOrientation";
												cke = toast;
												_text();
											}
											else {
												
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_removeAllViews2();
				}
			}
		}
		else {
			_removeAllViews2();
		}
	}
	
	
	public static void _view() {
		if (saveline.contains("View")) {
			dl = "View";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\+)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				lineck = line1.replace(dl, ",");
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							erorno = m1.group().replaceAll("\\s", "");
							if (!FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("View ".concat(erorno.concat(";")))) {
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/ViewAll")));
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(erorno));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).concat("\n".concat("ViewAll ".concat(erorno.concat(";")))));
								if (StopLine.equals("")) {
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(erorno.concat("/".concat(erorno.concat("mo")))), "true");
								}
							}
							else {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(erorno.concat("/".concat(erorno.concat("mo")))))) {
									_erorr2(dl, error, "الرجاء تغير الاسم لان الاسم مستخدم من قبل عنصر اخر");
								}
							}
						}
						else {
							_erorr2(dl, error, "الرجاء كتابة اسم لل".concat(dl));
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابه ; نهاية الكود");
					}
					line1 = saveline;
					_viewall();
				}
			}
			else {
				_viewall();
			}
		}
		else {
			_viewall();
		}
	}
	
	
	public static void _viewall() {
		if (saveline.contains(".name")) {
			dl = ".name";
			fg = "name";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													if (m3.group().equals("") || m3.group().equals(" ")) {
													
												}
												else {
													if (StopLine.equals("")) {
														FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))), m3.group());
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
												}
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_setTextColorView();
				}
			}
		}
		else {
			_setTextColorView();
		}
	}
	
	
	public static void _setTextColorView() {
		if (saveline.contains(".setTextColor")) {
			dl = ".setTextColor";
			fg = "setTextColor";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													if (m3.group().equals("") || m3.group().equals(" ")) {
													
												}
												else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
														if (StopLine.equals("")) {
															edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
															edvi2 = m3.group();
															int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																								View view = m.findViewById(resourceId);
															                                    if (view instanceof TextView) {
																										    TextView textView = (TextView) view;
																										    textView.setTextColor(Color.parseColor(edvi2));
																								} else if (view instanceof Button) {
																										    Button button = (Button) view;
																										    button.setTextColor(Color.parseColor(edvi2));
																								} else if (view instanceof EditText) {
																										    EditText editText = (EditText) view;
																										    editText.setTextColor(Color.parseColor(edvi2));
																								} else if (view instanceof CheckBox) {
																										    CheckBox checkBox = (CheckBox) view;
																										    checkBox.setTextColor(Color.parseColor(edvi2));
																								} else if (view instanceof RadioButton) {
																										    RadioButton radioButton = (RadioButton) view;
																										    radioButton.setTextColor(Color.parseColor(edvi2));
																								}  else if (view instanceof Switch) {
																										    Switch switchView = (Switch) view;
																										    switchView.setTextColor(Color.parseColor(edvi2));
																										
																								} else {
																										    // يتم التعامل مع الحالة إذا كان العنصر ليس من أحد الأنواع المذكورة أعلاه
																								}
														}
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
													if (StopLine.equals("")) {
														edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
														edvi2 = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
														int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																							View view = m.findViewById(resourceId);
														                                    if (view instanceof TextView) {
																									    TextView textView = (TextView) view;
																									    textView.setTextColor(Color.parseColor(edvi2));
																							} else if (view instanceof Button) {
																									    Button button = (Button) view;
																									    button.setTextColor(Color.parseColor(edvi2));
																							} else if (view instanceof EditText) {
																									    EditText editText = (EditText) view;
																									    editText.setTextColor(Color.parseColor(edvi2));
																							} else if (view instanceof CheckBox) {
																									    CheckBox checkBox = (CheckBox) view;
																									    checkBox.setTextColor(Color.parseColor(edvi2));
																							} else if (view instanceof RadioButton) {
																									    RadioButton radioButton = (RadioButton) view;
																									    radioButton.setTextColor(Color.parseColor(edvi2));
																							}  else if (view instanceof Switch) {
																									    Switch switchView = (Switch) view;
																									    switchView.setTextColor(Color.parseColor(edvi2));
																									
																							} else {
																									    // يتم التعامل مع الحالة إذا كان العنصر ليس من أحد الأنواع المذكورة أعلاه
																							}
													}
												}
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_background();
				}
			}
		}
		else {
			_background();
		}
	}
	
	
	public static void _background() {
		if (saveline.contains(".setBackgroundColor")) {
			dl = ".setBackgroundColor";
			fg = "setBackgroundColor";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													if (m3.group().equals("") || m3.group().equals(" ")) {
													
												}
												else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
														if (StopLine.equals("")) {
															edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
															edvi2 = m3.group();
															int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																								View view = m.findViewById(resourceId);
															                                   view.setBackgroundColor(Color.parseColor(edvi2));
																									
																								
														}
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
													if (StopLine.equals("")) {
														edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
														edvi2 = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
														int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																							View view = m.findViewById(resourceId);
														                                   view.setBackgroundColor(Color.parseColor(edvi2));
																								
																							
													}
												}
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_ColorView2();
				}
			}
		}
		else {
			_ColorView2();
		}
	}
	
	
	public static void _ColorView2() {
		if (saveline.contains(".ColorView")) {
			dl = ".ColorView";
			fg = "ColorView";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													if (m3.group().equals("") || m3.group().equals(" ")) {
													
												}
												else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
														if (StopLine.equals("")) {
															edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
															edvi2 = m3.group();
															int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																								View view = m.findViewById(resourceId);														
															_Ripple_Drawable(view, edvi2);
														}
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
													if (StopLine.equals("")) {
														edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
														edvi2 = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
														int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																							View view = m.findViewById(resourceId);														
														_Ripple_Drawable(view, edvi2);
													}
												}
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_addView2();
				}
			}
		}
		else {
			_addView2();
		}
	}
	
	
	public static void _addView2() {
		if (saveline.contains(".addView")) {
			dl = ".addView";
			fg = "addView";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													if (m3.group().equals("") || m3.group().equals(" ")) {
													
												}
												else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
														edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
														edvi2 = m3.group();
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
													edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
													edvi2 = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
												}
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
									Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
									while (m4.find()) {
											
											if (m4.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
											while (m3.find()) {
													
													if (m3.group().equals("") || m3.group().equals(" ")) {
													
												}
												else {
													if (StopLine.equals("")) {
														toast = m3.group();
														int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																							View view = m.findViewById(resourceId);
																							int resourceId2 = m.getResources().getIdentifier(edvi2, "id", m.getPackageName());
																							ViewGroup view2 = m.findViewById(resourceId2);
														                                    int resourceId3 = m.getResources().getIdentifier(toast, "id", m.getPackageName());
																							ViewGroup view3 = m.findViewById(resourceId3);
														                                    view2.removeView(view);
															view3.addView(view);
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isDirectory("/data/user/0/".concat(pkgapp.concat("/View/".concat(m4.group()))).replaceAll("\\s", ""))) {
												if (StopLine.equals("")) {
													no = m4.group().replaceAll("\\s", "");
													int resourceId2 = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																						View view2 = m.findViewById(resourceId2);
													                                    int resourceId3 = m.getResources().getIdentifier(edvi2, "id", m.getPackageName());
																						ViewGroup view3 = m.findViewById(resourceId3);
													if (StopLine.equals("")) {
														if (FileUtil.isExistFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr"))))) {
															line = new Gson().fromJson(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr")))), new TypeToken<ArrayList<String>>(){}.getType());
														}
														else {
															line.clear();
														}
														textline.add(view2);
														view3.removeView(view2);
														line.add(String.valueOf((long)(intview)));
														FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr"))), new Gson().toJson(line));
														intview++;
													}
												}
											}
											else {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
													if (StopLine.equals("")) {
														toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""));
														int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																							View view = m.findViewById(resourceId);
																							int resourceId2 = m.getResources().getIdentifier(edvi2, "id", m.getPackageName());
																							ViewGroup view2 = m.findViewById(resourceId2);
														                                    int resourceId3 = m.getResources().getIdentifier(toast, "id", m.getPackageName());
																							ViewGroup view3 = m.findViewById(resourceId3);
														                                    view2.removeView(view);
															view3.addView(view);
													}
												}
												else {
													_erorr2("View.addView", error, "لم يتم العثور على ".concat(m2.group()));
												}
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_setText2();
				}
			}
		}
		else {
			_setText2();
		}
	}
	
	
	public static void _setText2() {
		if (saveline.contains(".setText")) {
			dl = ".setText";
			fg = "setText";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													if (m3.group().equals("") || m3.group().equals(" ")) {
													
												}
												else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
														if (StopLine.equals("")) {
															edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
															edvi2 = m3.group();
															int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																								View view = m.findViewById(resourceId);
																								
																								if (view instanceof TextView) {
																										    TextView textView = (TextView) view;
																										    textView.setText(edvi2);
																								} else if (view instanceof Button) {
																										    Button button = (Button) view;
																										    button.setText(edvi2);
																								} else if (view instanceof EditText) {
																										    EditText editText = (EditText) view;
																										    editText.setText(edvi2);
																								} else if (view instanceof CheckBox) {
																										    CheckBox checkBox = (CheckBox) view;
																										    checkBox.setText(edvi2);
																								} else if (view instanceof RadioButton) {
																										    RadioButton radioButton = (RadioButton) view;
																										    radioButton.setText(edvi2);
																								}  else if (view instanceof Switch) {
																										    Switch switchView = (Switch) view;
																										    switchView.setText(edvi2);
																										
																								} else {
																										    // يتم التعامل مع الحالة إذا كان العنصر ليس من أحد الأنواع المذكورة أعلاه
																								}
														}
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
													if (StopLine.equals("")) {
														edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
														edvi2 = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
														int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																							View view = m.findViewById(resourceId);
																							
																							if (view instanceof TextView) {
																									    TextView textView = (TextView) view;
																									    textView.setText(edvi2);
																							} else if (view instanceof Button) {
																									    Button button = (Button) view;
																									    button.setText(edvi2);
																							} else if (view instanceof EditText) {
																									    EditText editText = (EditText) view;
																									    editText.setText(edvi2);
																							} else if (view instanceof CheckBox) {
																									    CheckBox checkBox = (CheckBox) view;
																									    checkBox.setText(edvi2);
																							} else if (view instanceof RadioButton) {
																									    RadioButton radioButton = (RadioButton) view;
																									    radioButton.setText(edvi2);
																							}  else if (view instanceof Switch) {
																									    Switch switchView = (Switch) view;
																									    switchView.setText(edvi2);
																									
																							} else {
																									    // يتم التعامل مع الحالة إذا كان العنصر ليس من أحد الأنواع المذكورة أعلاه
																							}
													}
												}
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_click();
				}
			}
		}
		else {
			_click();
		}
	}
	
	
	public static void _click() {
		if (saveline.contains(".performClick")) {
			dl = ".performClick";
			fg = "performClick";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
										if (StopLine.equals("")) {
											edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
											int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																				View view = m.findViewById(resourceId);
											                                   view.performClick();
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_setTextSize2();
				}
			}
		}
		else {
			_setTextSize2();
		}
	}
	
	
	public static void _setTextSize2() {
		if (saveline.contains(".setTextSize")) {
			dl = ".setTextSize";
			fg = "setTextSize";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
										Matcher m4 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
										while (m4.find()) {
												
												if (!m4.group().equals("")) {
												String regex = "^[0-9]+$";
												
												     
												toast = m4.group().replaceAll("\\s", "");
												if (toast.matches(regex)) {
													if (StopLine.equals("")) {
														edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
														edvi2 = toast;
														int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																							View view = m.findViewById(resourceId);
																							
																							if (view instanceof TextView) {
																									    TextView textView = (TextView) view;
																									    textView.setTextSize((float)Integer.parseInt(edvi2));
																							} else if (view instanceof Button) {
																									    Button button = (Button) view;
																									    button.setTextSize((float)Integer.parseInt(edvi2));
																							} else if (view instanceof EditText) {
																									    EditText editText = (EditText) view;
																									    editText.setTextSize((float)Integer.parseInt(edvi2));
																							} else if (view instanceof CheckBox) {
																									    CheckBox checkBox = (CheckBox) view;
																									    checkBox.setTextSize((float)Integer.parseInt(edvi2));
																							} else if (view instanceof RadioButton) {
																									    RadioButton radioButton = (RadioButton) view;
																									    radioButton.setTextSize((float)Integer.parseInt(edvi2));
																							}  else if (view instanceof Switch) {
																									    Switch switchView = (Switch) view;
																									    switchView.setTextSize((float)Integer.parseInt(edvi2));
																									
																							} else {
																									    // يتم التعامل مع الحالة إذا كان العنصر ليس من أحد الأنواع المذكورة أعلاه
																							}
													}
												}
												else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m4.group()))).replaceAll("\\s", ""))) {
														if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
															if (StopLine.equals("")) {
																edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
																edvi2 = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m4.group()))).replaceAll("\\s", ""));
																int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																									View view = m.findViewById(resourceId);
																									
																									if (view instanceof TextView) {
																											    TextView textView = (TextView) view;
																											    textView.setTextSize((float)Integer.parseInt(edvi2));
																									} else if (view instanceof Button) {
																											    Button button = (Button) view;
																											    button.setTextSize((float)Integer.parseInt(edvi2));
																									} else if (view instanceof EditText) {
																											    EditText editText = (EditText) view;
																											    editText.setTextSize((float)Integer.parseInt(edvi2));
																									} else if (view instanceof CheckBox) {
																											    CheckBox checkBox = (CheckBox) view;
																											    checkBox.setTextSize((float)Integer.parseInt(edvi2));
																									} else if (view instanceof RadioButton) {
																											    RadioButton radioButton = (RadioButton) view;
																											    radioButton.setTextSize((float)Integer.parseInt(edvi2));
																									}  else if (view instanceof Switch) {
																											    Switch switchView = (Switch) view;
																											    switchView.setTextSize((float)Integer.parseInt(edvi2));
																											
																									} else {
																											    // يتم التعامل مع الحالة إذا كان العنصر ليس من أحد الأنواع المذكورة أعلاه
																									}
															}
														}
														else {
															_erorr2("setTextSize", error, "الرجاء كتابة name للView");
														}
													}
													else {
														_erorr2(".setTextSize", error, "لم يتم العثور على ".concat(m4.group()));
													}
												}
											}
											else {
												_erorr2(".setTextSize", error, "الرجاء كتابة حجم النص");
											}
												
										}
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_removeView();
				}
			}
		}
		else {
			_removeView();
		}
	}
	
	
	public static void _removeView() {
		if (saveline.contains("removeView")) {
			dl = ".removeView";
			fg = "removeView";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													if (m3.group().equals("") || m3.group().equals(" ")) {
													
												}
												else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
														if (StopLine.equals("")) {
															edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
															edvi2 = m3.group();
															int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																								ViewGroup view = m.findViewById(resourceId);
																								int resourceId2 = m.getResources().getIdentifier(edvi2, "id", m.getPackageName());
																								View view2 = m.findViewById(resourceId2);
																								view.removeView(view2);
														}
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
													if (StopLine.equals("")) {
														edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
														edvi2 = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
														int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																							ViewGroup view = m.findViewById(resourceId);
																							int resourceId2 = m.getResources().getIdentifier(edvi2, "id", m.getPackageName());
																							View view2 = m.findViewById(resourceId2);
																							view.removeView(view2);
													}
												}
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_setVisibility2();
				}
			}
		}
		else {
			_setVisibility2();
		}
	}
	
	
	public static void _rendm(final double _rndom) {
		
		        String characters = re2;
		        StringBuilder randomString1 = new StringBuilder();
		        Random random = new Random();
		
		        for (int i = 0; i < _rndom; i++) {
			            int index = random.nextInt(characters.length());
			            randomString1.append(characters.charAt(index));
			        }
		randomString = randomString1.toString();
	}
	
	
	public static void _azre() {
		if (saveline.contains(".RandomString")) {
			dl = ".RandomString";
			fg = "RandomString";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										String regex = "^[0-9]+$";
									
									     
									randomString = m2.group().replaceAll("\\s", "");
									if (randomString.matches(regex)) {
										if (StopLine.equals("")) {
											toast = randomString;
										}
									}
									else {
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""));
											}
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
								Matcher m4 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
								while (m4.find()) {
										
										if (m4.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													re2 = m3.group();
													_rendm(Integer.parseInt(toast));
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), randomString);
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												re2 = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""));
												_rendm(Integer.parseInt(toast));
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/")).concat(Stringck), randomString);
											}
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m4.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck.concat("\nاو لم تقم بانشاء String")));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
	
	
	public static void _intrandm() {
		if (saveline.contains(".Random")) {
			dl = ".Random";
			fg = "Random";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData")))).contains("int ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData")))).contains("int ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData")))).contains("int ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
								while (m2.find()) {
										
										String regex = "^[0-9]+$";
									
									     
									dl = m2.group().replaceAll("\\s", "");
									if (dl.matches(regex)) {
										if (StopLine.equals("")) {
											toast = dl;
										}
									}
									else {
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""));
											}
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
								Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
								while (m4.find()) {
										
										String regex = "^[0-9]+$";
									
									     
									dl = m4.group().replaceAll("\\s", "");
									if (dl.matches(regex)) {
										if (StopLine.equals("")) {
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(Stringck))), String.valueOf((long)(SketchwareUtil.getRandom((int)(Integer.parseInt(toast)), (int)(Integer.parseInt(m4.group()))))));
										}
									}
									else {
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m4.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(Stringck))), String.valueOf((long)(SketchwareUtil.getRandom((int)(Integer.parseInt(toast)), (int)(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m4.group()))).replaceAll("\\s", ""))))))));
											}
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck.concat("\nاو لم تقم بانشاء int")));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
	
	
	public static void _StringtoInt() {
		if (saveline.contains("StringtoInt")) {
			
			ck = line1.replace("+", "");
			ck = ck.replace("StringtoInt", "+");
			ck = ":".concat(ck);
			Matcher m1 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m1.find()) {
					
					ck = ck.replace(m1.group(), "");
				if (!m1.group().equals("")) {
					Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
					while (m100018000.find()) {
							
							Stringck = m100018000.group().replace(")", "");
						Stringck = Stringck.replaceAll("\\s", "");
						if (FileUtil.isExistFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))))) {
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("StringtoInt(".concat(Stringck.concat(")"))))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck)))));
						}
						else {
							_erorr2("IntToString", error, "لم يتم العثور على ".concat(Stringck.concat("\nاو لم تقم بانشاء int")));
						}
							
					}
				}
				else {
					_erorr2("IntToString", error, "الرجاء تحقق من الكود صحيح");
				}
					
			}
		}
		else {
			
		}
	}
	
	
	public static void _setVisibility2() {
		if (saveline.contains(".setVisibility")) {
			dl = ".setVisibility";
			fg = "setVisibility";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (StopLine.equals("")) {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
												edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
												toast = m2.group().replaceAll("\\s", "");
												int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																					View view = m.findViewById(resourceId);
												if (toast.equals("GONE")) {
													view.setVisibility(View.GONE);
												}
												else {
													if (toast.equals("VISIBLE")) {
														view.setVisibility(View.VISIBLE);
													}
													else {
														if (toast.equals("INVISIBLE")) {
															view.setVisibility(View.INVISIBLE);
														}
														else {
															_erorr2(fg, error, "الرجاء كتابة ما الذي يحصل للعنصر");
														}
													}
												}
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_onClick2();
				}
			}
		}
		else {
			_onClick2();
		}
	}
	
	
	public static void _onClick2() {
		if (saveline.contains("onClick")) {
			dl = ".onClick";
			fg = "onClick";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\{").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
								s = "jjfjrj";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
									if (StopLine.equals("")) {
										FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/ButtonOnClick")));
										FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/ButtonOnClick/")).concat(Dialogs));
										OnClick2 = "/data/user/0/".concat(pkgapp.concat("/ButtonOnClick/")).concat(Dialogs.concat("/".concat(Dialogs).concat("OnClick")));
										OnClick3 = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
										Stringfile = "";
										StopLine = "5";
									}
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود");
						}
							
					}
				}
				else {
					if (saveline.contains("{")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة } نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_removeAllViews();
		}
	}
	
	
	public static void _removeAllViews() {
		if (saveline.contains(".removeAllViews")) {
			dl = ".removeAllViews";
			fg = "removeAllViews";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
											if (StopLine.equals("")) {
												edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
												int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																					ViewGroup view = m.findViewById(resourceId);
																					view.removeAllViews();
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_setErorr();
				}
			}
		}
		else {
			_setErorr();
		}
	}
	
	
	public static void _removeAllViews2() {
		if (saveline.contains(".removeAllViews")) {
			dl = ".removeAllViews";
			fg = "removeAllViews";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											cks = "removeAllViews";
										_text();
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_setError();
				}
			}
		}
		else {
			_setError();
		}
	}
	
	
	public static void _getactivyt() {
		if (saveline.contains(".putExtra")) {
			dl = ".putExtra";
			fg = "putExtra";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							TelegramBot = line1.replace(m1.group(), "");
							TelegramBot = TelegramBot.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Intent/".concat("Intent.txt")))).contains("Intent ".concat(TelegramBot.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat(fg))), m3.group());
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat(fg))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
											}
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
								Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
								while (m4.find()) {
										
										if (m4.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat(fg.concat("1")))), m3.group());
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Intent/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat(fg.concat("1")))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", "")));
											}
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m4.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(TelegramBot.concat("\nاو لم تقم بانشاء Intent")));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_startActivity();
		}
	}
	
	
	public static void _getputExtra() {
		if (saveline.contains(".getStringExtra")) {
			dl = ".getStringExtra";
			fg = "getStringExtra";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													if (m.getIntent().hasExtra(m3.group())) {
														FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), m.getIntent().getStringExtra(m3.group()));
													}
													else {
														FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), "");
													}
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (m.getIntent().hasExtra(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")))) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), m.getIntent().getStringExtra(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))));
											}
											else {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), "");
											}
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
	
	
	public static void _reeditstring() {
		if (saveline.contains(".replace")) {
			dl = ".replace";
			fg = "replace";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													toast = m3.group();
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
								Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\=)").matcher(saveline);
								while (m4.find()) {
										
										if (m4.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													dl = m3.group();
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
											dl = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""));
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m4.group()));
										}
									}
										
								}
								Matcher m5 = Pattern.compile("(?<=\\=)(.*)(?=\\))").matcher(saveline);
								while (m5.find()) {
										
										if (m5.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m5.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), toast.replace(dl, m3.group()));
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m5.group()))).replaceAll("\\s", ""))) {
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), toast.replace(dl, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m5.group()))).replaceAll("\\s", ""))));
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m5.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
	
	
	public static void _save() {
		if (saveline.contains("SaveString")) {
			dl = "SaveString";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (StopLine.equals("")) {
										toast = m3.group();
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
						Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
						while (m4.find()) {
								
								if (m4.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
								while (m3.find()) {
										
										if (StopLine.equals("")) {
										save2.edit().putString(toast, m3.group()).commit();
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										save2.edit().putString(toast, FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))).commit();
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m4.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2(dl, error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _getData() {
		if (saveline.contains(".getString")) {
			dl = ".getString";
			fg = "getString";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), save2.getString(m3.group(), ""));
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), save2.getString(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")), ""));
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
	
	
	public static void _rmove() {
		if (saveline.contains("removeData")) {
			dl = "removeData";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (StopLine.equals("")) {
										save2.edit().remove(m3.group()).commit();
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										save2.edit().remove(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))).commit();
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2(dl, error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _mintm() {
		if (saveline.contains("+=")) {
			
			ck = line1;
			ck = ck.replace("+=", "\"");
			Matcher m2 = Pattern.compile("(?<=\\\")(.*)(?=\\;)").matcher(ck);
			while (m2.find()) {
					
					ck = ck.replace(m2.group(), "");
				ck = ck.replace("\"", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("=", "");
				ck = ck.replace("+", "");
				ck = ck.replace(";", "");
				if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))))) {
					s = "dndjrjdi";
					Matcher m3 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(saveline);
					while (m3.find()) {
							
							toast = m3.group().replaceAll("\\s", "");
						String regex = "^[0-9]+$";
						
						     
						if (toast.matches(regex)) {
							int mn=0;
							mn = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))))) + Integer.parseInt(toast);
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))), String.valueOf((long)(mn)));
						}
						else {
							if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m3.group()))).replaceAll("\\s", ""))) {
								toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m3.group()))).replaceAll("\\s", ""));
								if (toast.matches(regex)) {
									int mn=0;
									mn = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))))) + Integer.parseInt(toast);
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))), String.valueOf((long)(mn)));
								}
								else {
									
								}
							}
							else {
								_erorr2("int", error, "لم يتم العثور على ".concat(m3.group()));
							}
						}
							
					}
				}
					
			}
		}
		else {
			if (saveline.contains("-=")) {
				
				ck = line1;
				ck = ck.replace("-=", "\"");
				Matcher m2 = Pattern.compile("(?<=\\\")(.*)(?=\\;)").matcher(ck);
				while (m2.find()) {
						
						ck = ck.replace(m2.group(), "");
					ck = ck.replace("\"", "");
					ck = ck.replaceAll("\\s", "");
					ck = ck.replace("=", "");
					ck = ck.replace("+", "");
					ck = ck.replace(";", "");
					if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))))) {
						s = "dndjrjdi";
						Matcher m3 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(saveline);
						while (m3.find()) {
								
								toast = m3.group().replaceAll("\\s", "");
							String regex = "^[0-9]+$";
							
							     
							if (toast.matches(regex)) {
								int mn=0;
								mn = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))))) - Integer.parseInt(toast);
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))), String.valueOf((long)(mn)));
							}
							else {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m3.group()))).replaceAll("\\s", ""))) {
									toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m3.group()))).replaceAll("\\s", ""));
									if (toast.matches(regex)) {
										int mn=0;
										mn = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))))) - Integer.parseInt(toast);
										FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(ck))), String.valueOf((long)(mn)));
									}
									else {
										
									}
								}
								else {
									_erorr2("int", error, "لم يتم العثور على ".concat(m3.group()));
								}
							}
								
						}
					}
						
				}
			}
			else {
				
			}
		}
	}
	
	
	public static void _setRequestedOrientation() {
		if (saveline.contains("setRequestedOrientation")) {
			dl = "setRequestedOrientation";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							toast = m2.group().replaceAll("\\s", "");
							if (toast.equals("Lanscape")) {
								//Lanscape Mode
								m.setRequestedOrientation(android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
							}
							else {
								if (toast.equals("Portrait")) {
									//Portrait Mode
									m.setRequestedOrientation(android.content.pm.ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
								}
								else {
									_erorr2(dl, error, "الرجاء كتابة Portrait او Lanscape بين القوسين");
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _Time2() {
		if (saveline.contains("Timer")) {
			dl = "Timer";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\{").matcher(line1);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					s = "jjfjrj";
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\{)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								String regex = "^[0-9]+$";
							
							     
							toast = m2.group().replaceAll("\\s", "");
							if (toast.matches(regex)) {
								if (StopLine.equals("")) {
									Stringfile = "";
									AddFileString = toast;
									Time2f = "Timer".concat(String.valueOf((long)(SketchwareUtil.getRandom((int)(10000), (int)(99999)))));
									StopLine = "7";
								}
							}
							else {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										Stringfile = "";
										AddFileString = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""));
										Time2f = "Timer".concat(String.valueOf((long)(SketchwareUtil.getRandom((int)(10000), (int)(99999)))));
										StopLine = "7";
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ( وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("{")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة } نهاية الكود");
					}
				}
				else {
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _setErorr() {
		if (saveline.contains(".setError")) {
			dl = ".setError";
			fg = "setError";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													if (m3.group().equals("") || m3.group().equals(" ")) {
													
												}
												else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
														if (StopLine.equals("")) {
															edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
															int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																								View view = m.findViewById(resourceId);
																								
																								if (view instanceof EditText) {
																										    EditText editText = (EditText) view;
																										    
																										
																								
																((EditText)editText).setError(m3.group());
																} else {
																										    // يتم التعامل مع الحالة إذا كان العنصر ليس من أحد الأنواع المذكورة أعلاه
																								}
														}
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
													if (StopLine.equals("")) {
														edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
														edvi2 = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
														int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																							View view = m.findViewById(resourceId);
																							
																							if (view instanceof TextView) {
																									    TextView textView = (TextView) view;
																									    textView.setText(edvi2);
																							} else if (view instanceof Button) {
																									    Button button = (Button) view;
																									    button.setText(edvi2);
																							} else if (view instanceof EditText) {
																									    EditText editText = (EditText) view;
																									    editText.setText(edvi2);
																							} else if (view instanceof CheckBox) {
																									    CheckBox checkBox = (CheckBox) view;
																									    checkBox.setText(edvi2);
																							} else if (view instanceof RadioButton) {
																									    RadioButton radioButton = (RadioButton) view;
																									    radioButton.setText(edvi2);
																							}  else if (view instanceof Switch) {
																									    Switch switchView = (Switch) view;
																									    switchView.setText(edvi2);
																									
																							} else {
																									    // يتم التعامل مع الحالة إذا كان العنصر ليس من أحد الأنواع المذكورة أعلاه
																							}
													}
												}
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_LayoutParams();
				}
			}
		}
		else {
			_LayoutParams();
		}
	}
	
	
	public static void _setError() {
		if (saveline.contains(".setError")) {
			dl = ".setError";
			fg = "setError";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
													cks = fg;
													cke = m3.group();
													_text();
												}
												else {
													_erorr2(fg, error, "حدث خطاء الرجاء تحقق من صحت الكود");
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
													cks = fg;
													cke = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
													_text();
												}
												else {
													_erorr2(fg, error, "حدث خطاء الرجاء تحقق من صحت الكود");
												}
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل Dialog"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_linerwith();
				}
			}
		}
		else {
			_linerwith();
		}
	}
	
	
	public static void _setError3() {
		if (saveline.contains(".setError")) {
			dl = ".setError";
			fg = "setError";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				nu = line1;
				nu = nu.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("edittexterr"))), m3.group());
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("edittexterr"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_setView();
		}
	}
	
	
	public static void _linerwith() {
		if (saveline.contains(".LayoutParams")) {
			dl = ".LayoutParams";
			fg = "LayoutParams";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
									while (m2.find()) {
											
											toast = m2.group().replaceAll("\\s", "");
										String regex = "^[0-9]+$";
										
										     
										if (toast.matches(regex)) {
											cke3 = Integer.parseInt(toast);
										}
										else {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
												cke3 = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", "")));
											}
											else {
												if (toast.equals("WRAP_CONTENT")) {
													cke3 = LinearLayout.LayoutParams.WRAP_CONTENT;
												}
												else {
													if (toast.equals("MATCH_PARENT")) {
														cke3 = LinearLayout.LayoutParams.MATCH_PARENT;
													}
													else {
														_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
													}
												}
											}
										}
											
									}
									Matcher m3 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
									while (m3.find()) {
											
											toast = m3.group().replaceAll("\\s", "");
										String regex = "^[0-9]+$";
										
										     
										if (toast.matches(regex)) {
											cks = "LayoutParams";
											cke4 = Integer.parseInt(toast);
											_text();
										}
										else {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m3.group()))).replaceAll("\\s", ""))) {
												cks = "LayoutParams";
												cke4 = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m3.group()))).replaceAll("\\s", "")));
												_text();
											}
											else {
												if (toast.equals("WRAP_CONTENT")) {
													cks = "LayoutParams";
													cke4 = LinearLayout.LayoutParams.WRAP_CONTENT;
													_text();
												}
												else {
													if (toast.equals("MATCH_PARENT")) {
														cks = "LayoutParams";
														cke4 = LinearLayout.LayoutParams.MATCH_PARENT;
														_text();
													}
													else {
														_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
													}
												}
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
						if (saveline.contains(",")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة,");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_setPadding();
				}
			}
		}
		else {
			_setPadding();
		}
	}
	
	
	public static void _LayoutParams() {
		if (saveline.contains(".LayoutParams")) {
			dl = ".LayoutParams";
			fg = "LayoutParams";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
									while (m2.find()) {
											
											toast = m2.group().replaceAll("\\s", "");
										String regex = "^[0-9]+$";
										
										     
										if (toast.matches(regex)) {
											cke3 = Integer.parseInt(toast);
										}
										else {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
												cke3 = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", "")));
											}
											else {
												if (toast.equals("WRAP_CONTENT")) {
													cke3 = LinearLayout.LayoutParams.WRAP_CONTENT;
												}
												else {
													if (toast.equals("MATCH_PARENT")) {
														cke3 = LinearLayout.LayoutParams.MATCH_PARENT;
													}
													else {
														_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
													}
												}
											}
										}
											
									}
									Matcher m3 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
									while (m3.find()) {
											
											toast = m3.group().replaceAll("\\s", "");
										String regex = "^[0-9]+$";
										
										     
										if (toast.matches(regex)) {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
												if (StopLine.equals("")) {
													edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
													cke4 = Integer.parseInt(toast);
													int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																						View view = m.findViewById(resourceId);
																						
																						
													int wrapContent =(int) cke3;
													int wrapContent2=(int)cke4;
													LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(wrapContent, wrapContent2);
													
													view.setLayoutParams(layoutParams);
													
												}
											}
										}
										else {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m3.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
													if (StopLine.equals("")) {
														edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
														cke4 = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m3.group()))).replaceAll("\\s", "")));
														int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																							View view = m.findViewById(resourceId);
																							
																							
														int wrapContent =(int) cke3;
														int wrapContent2=(int)cke4;
														LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(wrapContent, wrapContent2);
														
														view.setLayoutParams(layoutParams);
														
													}
												}
											}
											else {
												if (toast.equals("WRAP_CONTENT")) {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
														if (StopLine.equals("")) {
															edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
															cke4 = LinearLayout.LayoutParams.WRAP_CONTENT;
															int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																								View view = m.findViewById(resourceId);
																								
																								
															int wrapContent =(int) cke3;
															int wrapContent2=(int)cke4;
															LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(wrapContent, wrapContent2);
															
															view.setLayoutParams(layoutParams);
															
														}
													}
												}
												else {
													if (toast.equals("MATCH_PARENT")) {
														if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
															if (StopLine.equals("")) {
																edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
																cke4 = LinearLayout.LayoutParams.MATCH_PARENT;
																int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																									View view = m.findViewById(resourceId);
																									
																									
																int wrapContent =(int) cke3;
																int wrapContent2=(int)cke4;
																LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(wrapContent, wrapContent2);
																
																view.setLayoutParams(layoutParams);
																
															}
														}
													}
													else {
														_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
													}
												}
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
						if (saveline.contains(",")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ,");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_setPadding2();
				}
			}
		}
		else {
			_setPadding2();
		}
	}
	
	
	public static void _setPadding() {
		if (saveline.contains(".setPadding")) {
			dl = ".setPadding";
			fg = "setPadding";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											toast = m2.group().replaceAll("\\s", "");
										String regex = "^[0-9]+$";
										
										     
										if (toast.matches(regex)) {
											cks = "setPadding";
											cke3 = Integer.parseInt(toast);
											_text();
										}
										else {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
												cks = "setPadding";
												cke3 = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", "")));
												_text();
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_layout_gravity();
				}
			}
		}
		else {
			_layout_gravity();
		}
	}
	
	
	public static void _layout_gravity() {
		if (saveline.contains(".gravity")) {
			dl = ".gravity";
			fg = "gravity";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											toast = m2.group().replaceAll("\\s", "");
										if (toast.equals("CENTER_HORIZONTAL")) {
											cks = "gravity";
											cke3 = Gravity.CENTER_HORIZONTAL;
											_text();
										}
										else {
											if (toast.equals("CENTER_VERTICAL")) {
												cks = "gravity";
												cke3 = Gravity.CENTER_VERTICAL;
												_text();
											}
											else {
												if (toast.equals("Gravity.LEFT")) {
													cks = "gravity";
													cke3 = Gravity.LEFT;
													_text();
												}
												else {
													if (toast.equals("Gravity.RIGHT")) {
														cks = "gravity";
														cke3 = Gravity.RIGHT;
														_text();
													}
													else {
														if (toast.equals("Gravity.TOP")) {
															cks = "gravity";
															cke3 = Gravity.TOP;
															_text();
														}
														else {
															if (toast.equals("Gravity.BOTTOM")) {
																cks = "gravity";
																cke3 = Gravity.BOTTOM;
																_text();
															}
															else {
																_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
															}
														}
													}
												}
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_setGravity();
				}
			}
		}
		else {
			_setGravity();
		}
	}
	
	
	public static void _setPadding2() {
		if (saveline.contains(".setPadding")) {
			dl = ".setPadding";
			fg = "setPadding";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											toast = m2.group().replaceAll("\\s", "");
										String regex = "^[0-9]+$";
										
										     
										if (toast.matches(regex)) {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
												if (StopLine.equals("")) {
													edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
													cke3 = Integer.parseInt(toast);
													int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																						View view = m.findViewById(resourceId);
																						
																						
													int paddingValueInDp = (int) cke3;
													    float density = m.getResources().getDisplayMetrics().density;
													    int paddingValueInPx = (int) (paddingValueInDp * density);
													    view.setPadding(paddingValueInPx, paddingValueInPx, paddingValueInPx, paddingValueInPx);
												}
											}
										}
										else {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
													if (StopLine.equals("")) {
														edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
														cke3 = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", "")));
														int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																							View view = m.findViewById(resourceId);
																							
																							
														int paddingValueInDp = (int) cke3;
														    float density = m.getResources().getDisplayMetrics().density;
														    int paddingValueInPx = (int) (paddingValueInDp * density);
														    view.setPadding(paddingValueInPx, paddingValueInPx, paddingValueInPx, paddingValueInPx);
													}
												}
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل View"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_layout_gravity2();
				}
			}
		}
		else {
			_layout_gravity2();
		}
	}
	
	
	public static void _layout_gravity2() {
		if (saveline.contains(".gravity")) {
			dl = ".gravity";
			fg = "gravity";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											toast = m2.group().replaceAll("\\s", "");
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
											edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
											if (toast.equals("CENTER_HORIZONTAL")) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
													cke3 = Gravity.CENTER_HORIZONTAL;
													int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																						View view = m.findViewById(resourceId);
																						
																						
													LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams( view.getLayoutParams());
													int wrapContent =(int) cke3;
													int newGravity = layoutParams.gravity | wrapContent;
													layoutParams.gravity = newGravity;
													view.setLayoutParams(layoutParams);
												}
											}
											else {
												if (toast.equals("CENTER_VERTICAL")) {
													if (StopLine.equals("")) {
														cke3 = Gravity.CENTER_VERTICAL;
														int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																							View view = m.findViewById(resourceId);
																							
																							
														LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams( view.getLayoutParams());
														int wrapContent =(int) cke3;
														int newGravity = layoutParams.gravity | wrapContent;
														layoutParams.gravity = newGravity;
														view.setLayoutParams(layoutParams);
													}
												}
												else {
													if (toast.equals("Gravity.LEFT")) {
														if (StopLine.equals("")) {
															cke3 = Gravity.LEFT;
															int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																								View view = m.findViewById(resourceId);
																								
																								
															LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams( view.getLayoutParams());
															int wrapContent =(int) cke3;
															int newGravity = layoutParams.gravity | wrapContent;
															layoutParams.gravity = newGravity;
															view.setLayoutParams(layoutParams);
														}
													}
													else {
														if (toast.equals("Gravity.RIGHT")) {
															if (StopLine.equals("")) {
																cke3 = Gravity.RIGHT;
																int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																									View view = m.findViewById(resourceId);
																									
																									
																LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams( view.getLayoutParams());
																int wrapContent =(int) cke3;
																int newGravity = layoutParams.gravity | wrapContent;
																layoutParams.gravity = newGravity;
																view.setLayoutParams(layoutParams);
															}
														}
														else {
															if (toast.equals("Gravity.TOP")) {
																if (StopLine.equals("")) {
																	cke3 = Gravity.TOP;
																	int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																										View view = m.findViewById(resourceId);
																										
																										
																	LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams( view.getLayoutParams());
																	int wrapContent =(int) cke3;
																	int newGravity = layoutParams.gravity | wrapContent;
																	layoutParams.gravity = newGravity;
																	view.setLayoutParams(layoutParams);
																}
															}
															else {
																if (toast.equals("Gravity.BOTTOM")) {
																	if (StopLine.equals("")) {
																		cke3 = Gravity.BOTTOM;
																		int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																											View view = m.findViewById(resourceId);
																											
																											
																		LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams( view.getLayoutParams());
																		int wrapContent =(int) cke3;
																		int newGravity = layoutParams.gravity | wrapContent;
																		layoutParams.gravity = newGravity;
																		view.setLayoutParams(layoutParams);
																	}
																}
																else {
																	_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
																}
															}
														}
													}
												}
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_setGravity2();
				}
			}
		}
		else {
			_setGravity2();
		}
	}
	
	
	public static void _setGravity() {
		if (saveline.contains(".setGravity")) {
			dl = ".setGravity";
			fg = "setGravity";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
									Matcher m = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
									while (m.find()) {
											
											toast = m.group().replaceAll("\\s", "");
										if (toast.equals("CENTER_HORIZONTAL")) {
											cke4 = Gravity.CENTER_HORIZONTAL;
										}
										else {
											if (toast.equals("CENTER_VERTICAL")) {
												cke4 = Gravity.CENTER_VERTICAL;
											}
											else {
												if (toast.equals("Gravity.LEFT")) {
													cke4 = Gravity.LEFT;
												}
												else {
													if (toast.equals("Gravity.RIGHT")) {
														cke4 = Gravity.RIGHT;
													}
													else {
														if (toast.equals("Gravity.TOP")) {
															cke4 = Gravity.TOP;
														}
														else {
															if (toast.equals("Gravity.BOTTOM")) {
																cke4 = Gravity.BOTTOM;
															}
															else {
																_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
															}
														}
													}
												}
											}
										}
											
									}
									Matcher m2 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											toast = m2.group().replaceAll("\\s", "");
										if (toast.equals("CENTER_HORIZONTAL")) {
											cks = "setGravity";
											cke3 = Gravity.CENTER_HORIZONTAL;
											_text();
										}
										else {
											if (toast.equals("CENTER_VERTICAL")) {
												cks = "setGravity";
												cke3 = Gravity.CENTER_VERTICAL;
												_text();
											}
											else {
												if (toast.equals("Gravity.LEFT")) {
													cks = "setGravity";
													cke3 = Gravity.LEFT;
													_text();
												}
												else {
													if (toast.equals("Gravity.RIGHT")) {
														cks = "setGravity";
														cke3 = Gravity.RIGHT;
														_text();
													}
													else {
														if (toast.equals("Gravity.TOP")) {
															cks = "setGravity";
															cke3 = Gravity.TOP;
															_text();
														}
														else {
															if (toast.equals("Gravity.BOTTOM")) {
																cks = "setGravity";
																cke3 = Gravity.BOTTOM;
																_text();
															}
															else {
																_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
															}
														}
													}
												}
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
						if (saveline.contains(",")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ,");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_weight();
				}
			}
		}
		else {
			_weight();
		}
	}
	
	
	public static void _setGravity2() {
		if (saveline.contains(".setGravity")) {
			dl = ".setGravity";
			fg = "setGravity";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m0 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
									while (m0.find()) {
											
											toast = m0.group().replaceAll("\\s", "");
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
											edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
											int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																				View view = m.findViewById(resourceId);								
											if (toast.equals("CENTER_HORIZONTAL")) {
												cke3 = Gravity.CENTER_HORIZONTAL;
											}
											else {
												if (toast.equals("CENTER_VERTICAL")) {
													cke3 = Gravity.CENTER_VERTICAL;
												}
												else {
													if (toast.equals("Gravity.LEFT")) {
														cke3 = Gravity.LEFT;
													}
													else {
														if (toast.equals("Gravity.RIGHT")) {
															cke3 = Gravity.RIGHT;
														}
														else {
															if (toast.equals("Gravity.TOP")) {
																cke3 = Gravity.TOP;
															}
															else {
																if (toast.equals("Gravity.BOTTOM")) {
																	cke3 = Gravity.BOTTOM;
																}
																else {
																	_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
																}
															}
														}
													}
												}
											}
										}
											
									}
									Matcher m2 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											toast = m2.group().replaceAll("\\s", "");
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
											edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
											int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																				View view = m.findViewById(resourceId);								
											int g=(int) cke3;
											if (toast.equals("CENTER_HORIZONTAL")) {
												cke3 = Gravity.CENTER_HORIZONTAL;
												    
												        int wrapContent =(int) cke3| g;
												            try {
													              view.getClass().getMethod("setGravity", int.class).invoke(view, wrapContent);
													            } catch (Exception e) {
													                // يمكنك إدراج معالجة الاستثناء هنا إذا كنت بحاجة إليها
													            }
											}
											else {
												if (toast.equals("CENTER_VERTICAL")) {
													cke3 = Gravity.CENTER_VERTICAL;
													    
													        int wrapContent =(int) cke3| g;
													            try {
														              view.getClass().getMethod("setGravity", int.class).invoke(view, wrapContent);
														            } catch (Exception e) {
														                // يمكنك إدراج معالجة الاستثناء هنا إذا كنت بحاجة إليها
														            }
												}
												else {
													if (toast.equals("Gravity.LEFT")) {
														cke3 = Gravity.LEFT;
														    
														        int wrapContent =(int) cke3| g;
														            try {
															              view.getClass().getMethod("setGravity", int.class).invoke(view, wrapContent);
															            } catch (Exception e) {
															                // يمكنك إدراج معالجة الاستثناء هنا إذا كنت بحاجة إليها
															            }
													}
													else {
														if (toast.equals("Gravity.RIGHT")) {
															cke3 = Gravity.RIGHT;
															    
															        int wrapContent =(int) cke3| g;
															            try {
																              view.getClass().getMethod("setGravity", int.class).invoke(view, wrapContent);
																            } catch (Exception e) {
																                // يمكنك إدراج معالجة الاستثناء هنا إذا كنت بحاجة إليها
																            }
														}
														else {
															if (toast.equals("Gravity.TOP")) {
																cke3 = Gravity.TOP;
																    
																        int wrapContent =(int) cke3| g;
																            try {
																	              view.getClass().getMethod("setGravity", int.class).invoke(view, wrapContent);
																	            } catch (Exception e) {
																	                // يمكنك إدراج معالجة الاستثناء هنا إذا كنت بحاجة إليها
																	            }
															}
															else {
																if (toast.equals("Gravity.BOTTOM")) {
																	cke3 = Gravity.BOTTOM;
																	    
																	        int wrapContent =(int) cke3| g;
																	            try {
																		              view.getClass().getMethod("setGravity", int.class).invoke(view, wrapContent);
																		            } catch (Exception e) {
																		                // يمكنك إدراج معالجة الاستثناء هنا إذا كنت بحاجة إليها
																		            }
																}
																else {
																	_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
																}
															}
														}
													}
												}
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
						if (saveline.contains(",")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ,");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_weight2();
				}
			}
		}
		else {
			_weight2();
		}
	}
	
	
	public static void _weight() {
		if (saveline.contains(".weight")) {
			dl = ".weight";
			fg = "weight";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											toast = m2.group().replaceAll("\\s", "");
										String regex = "^[0-9]+$";
										
										     
										if (toast.matches(regex)) {
											cks = "weight";
											cke3 = Integer.parseInt(toast);
											_text();
										}
										else {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
												cks = "weight";
												cke3 = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", "")));
												_text();
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
						if (saveline.contains(",")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ,");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					_ColorView();
				}
			}
		}
		else {
			_ColorView();
		}
	}
	
	
	public static void _weight2() {
		if (saveline.contains(".weight")) {
			dl = ".weight";
			fg = "weight";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											toast = m2.group().replaceAll("\\s", "");
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
											edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
											int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																				View view = m.findViewById(resourceId);								
											String regex = "^[0-9]+$";
											
											     
											if (toast.matches(regex)) {
												cke3 = Integer.parseInt(toast);
												LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams( view.getLayoutParams());
												float wrapContent =(float) cke3;
												layoutParams.weight = wrapContent;
												view.setLayoutParams(layoutParams);
											}
											else {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
													cke3 = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", "")));
													LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams( view.getLayoutParams());
													float wrapContent =(float) cke3;
													layoutParams.weight = wrapContent;
													view.setLayoutParams(layoutParams);
												}
												else {
													_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
												}
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
						if (saveline.contains(",")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ,");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
				_setOrientation2();	
				}
			}
		}
		else {
			_setOrientation2();
		}
	}
	
	public static void _setView() {
		if (saveline.contains(".setView")) {
			dl = ".setView";
			fg = "setView";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				line1 = line1.replace("{", "");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										stoperror = "dsdd";
									if (FileUtil.isDirectory("/data/user/0/".concat(pkgapp.concat("/View/".concat(m2.group()))).replaceAll("\\s", ""))) {
										no = m2.group().replaceAll("\\s", "");
										if (FileUtil.isExistFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no.concat("id")))))) {
											if (FileUtil.isExistFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no.concat("LinearLayout")))))) {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("setView"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no.concat("id"))))));
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("setViewid"))), no);
												}
											}
											else {
												_erorr2(fg, error, "عذرً الرجاء كتابة فقط من نوع LinearLayout");
											}
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(no));
										}
									}
									else {
										_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_dismiss();
		}
	}
	
	
	public static void _dismiss() {
		if (saveline.contains(".dismiss")) {
			dl = ".dismiss";
			fg = "dismiss";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				line1 = line1.replace("{", "");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (StopLine.equals("")) {
										alertDialog.dismiss();
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_Color();
		}
	}
		
	public static void _ColorView() {
		if (saveline.contains(".ColorView")) {
			dl = ".ColorView";
			fg = "ColorView";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													if (m3.group().equals("") || m3.group().equals(" ")) {
													
												}
												else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
														cks = "ColorView";
														cke = m3.group();
														_text();
													}
													else {
														_erorr2("setText", error, "حدث خطاء الرجاء تحقق من صحت الكود");
													}
												}
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {
													cks = "ColorView";
													cke = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
													_text();
												}
												else {
													_erorr2("setText", error, "حدث خطاء الرجاء تحقق من صحت الكود");
												}
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
				_setVisibilityView();
				}
			}
		}
		else {
			_setVisibilityView();
		}
	}
	public static void _Color() {
		if (saveline.contains(".Color")) {
			dl = ".Color";
			fg = "Color";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				nu = line1;
				nu = nu.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				toast = saveline.replaceAll("\\s", "");
				if (toast.contains("Color(")) {
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (m2.group().contains("\"")) {
											Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
											while (m3.find()) {
													
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("color"))), m3.group());
													
											}
										}
										else {
											stoperror = "dsdd";
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("color"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
											}
											else {
												_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
							}
								
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					line1 = saveline;
					_ColorButoon1();
				}
			}
		}
		else {
			_ColorButoon1();
		}
	}
		public static void _color3(final String _color1, final String _color2, final String _color3) {
		Dialogs = _color1;
		if (FileUtil.isFile(_color2)) {
			if (StopLine.equals("")) {
				try {
							
					StopLine = "";
					Stringfile = "";
					AddFileont = 0;
					toast = "";
					toastfil = "";
					message = "";
					title = "";
					stop = "";
					if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("edittext"))))) {
						if (StopLine.equals("")) {
							FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/String/")));
							FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Dialogs.concat(".getText()")))), _color3);
						}
					}
					lineCounter(_color2);
							} catch(Exception e) {
								
						}
			}
		}
		else {
			_erorr2("start", error, "لم يتم العثور على ملف تشغيل");
		}
	}
	public static void _ColorButoon1() {
		if (saveline.contains(".ColorButton1")) {
			dl = ".ColorButton1";
			fg = "ColorButton1";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				nu = line1;
				nu = nu.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorButton1"))), m3.group());
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorButton1"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_ColorButton2();
		}
	}
	
	
	public static void _ColorButton2() {
		if (saveline.contains(".ColorButton2")) {
			dl = ".ColorButton2";
			fg = "ColorButton2";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				nu = line1;
				nu = nu.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorButton2"))), m3.group());
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorButton2"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_ColorButton3();
		}
	}
	
	
	public static void _ColorButton3() {
		if (saveline.contains(".ColorButton3")) {
			dl = ".ColorButton3";
			fg = "ColorButton3";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				nu = line1;
				nu = nu.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorButton3"))), m3.group());
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorButton3"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_ColorTitle();
		}
	}
	
	
	public static void _ColorTitle() {
		if (saveline.contains(".ColorTitle")) {
			dl = ".ColorTitle";
			fg = "ColorTitle";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				nu = line1;
				nu = nu.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorTitle"))), m3.group());
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorTitle"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_ColorMessage();
		}
	}
	
	
	public static void _ColorMessage() {
		if (saveline.contains(".ColorMessage")) {
			dl = ".ColorMessage";
			fg = "ColorMessage";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				nu = line1;
				nu = nu.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/".concat("Dialog.txt")))).contains("Dialog ".concat(Dialogs.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorMessage"))), m3.group());
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorMessage"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")));
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\nاو لم تقم بانشاء Dialog")));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			_DlStart();
		}
	}
	
	
	public static void _start2(final AlertDialog.Builder _dlo) {
		AlertDialog.Builder d1= _dlo;
		final EditText edittext = new EditText(m);
		LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		edittext.setLayoutParams(lpar);
		if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button1"))))) {
			button1st = "/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button1on")));
			if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("color"))))) {
				   String positiveButtonText = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button1"))));
				        SpannableString spannableString = new SpannableString(positiveButtonText);
				        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("color")))))), 0, positiveButtonText.length(), 0);
				        d1.setPositiveButton(spannableString, new DialogInterface.OnClickListener() {
					            @Override
					            public void onClick(DialogInterface _dialog, int _which) {
						_color3(button, button1st, edittext.getText().toString());
						            }
					        });
				
				        
			}
			else {
				d1.setPositiveButton(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button1")))), new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_color3(button, button1st, edittext.getText().toString());
					}
				});
			}
			if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorButton1"))))) {
				   String positiveButtonText = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button1"))));
				        SpannableString spannableString = new SpannableString(positiveButtonText);
				        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorButton1")))))), 0, positiveButtonText.length(), 0);
				        d1.setPositiveButton(spannableString, new DialogInterface.OnClickListener() {
					            @Override
					            public void onClick(DialogInterface _dialog, int _which) {
						_color3(button, button1st, edittext.getText().toString());
						            }
					        });
				
				        
			}
			else {
				
			}
		}
		if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button2"))))) {
			button2st = "/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button2on")));
			if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorButton2"))))) {
				   String positiveButtonText2 = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button2"))));
				        SpannableString spannableString2 = new SpannableString(positiveButtonText2);
				        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorButton2")))))), 0, positiveButtonText2.length(), 0);
				        d1.setNegativeButton(spannableString2, new DialogInterface.OnClickListener() {
					            @Override
					            public void onClick(DialogInterface _dialog, int _which) {
						_color3(button, button2st, edittext.getText().toString());
						            }
					        });
				
				        
			}
			else {
				if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("color"))))) {
					   String positiveButtonText2 = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button2"))));
					        SpannableString spannableString2 = new SpannableString(positiveButtonText2);
					        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("color")))))), 0, positiveButtonText2.length(), 0);
					        d1.setNegativeButton(spannableString2, new DialogInterface.OnClickListener() {
						            @Override
						            public void onClick(DialogInterface _dialog, int _which) {
							_color3(button, button2st, edittext.getText().toString());
							            }
						        });
					
					        
				}
				else {
					d1.setNegativeButton(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button2")))), new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							_color3(button, button2st, edittext.getText().toString());
						}
					});
				}
			}
		}
		if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button3"))))) {
			button3st = "/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button3on")));
			if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorButton3"))))) {
				   String positiveButtonText3 = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button3"))));
				        SpannableString spannableString3 = new SpannableString(positiveButtonText3);
				        spannableString3.setSpan(new ForegroundColorSpan(Color.parseColor(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("ColorButton3")))))), 0, positiveButtonText3.length(), 0);
				        d1.setNeutralButton(spannableString3, new DialogInterface.OnClickListener() {
					            @Override
					            public void onClick(DialogInterface _dialog, int _which) {
						_color3(button, button3st, edittext.getText().toString());
						            }
					        });
				
				        
			}
			else {
				if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("color"))))) {
					   String positiveButtonText3 = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button3"))));
					        SpannableString spannableString3 = new SpannableString(positiveButtonText3);
					        spannableString3.setSpan(new ForegroundColorSpan(Color.parseColor(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("color")))))), 0, positiveButtonText3.length(), 0);
					        d1.setNeutralButton(spannableString3, new DialogInterface.OnClickListener() {
						            @Override
						            public void onClick(DialogInterface _dialog, int _which) {
							_color3(button, button3st, edittext.getText().toString());
							            }
						        });
					
					        
				}
				else {
					d1.setNeutralButton(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("button3")))), new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							_color3(button, button3st, edittext.getText().toString());
						}
					});
				}
			}
		}
		if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("cancelable"))))) {
			if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("cancelable")))).equals("true")) {
				if (StopLine.equals("")) {
					d1.setCancelable(true);
				}
			}
			else {
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("cancelable")))).equals("false")) {
					if (StopLine.equals("")) {
						d1.setCancelable(false);
					}
				}
			}
		}
		if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("edittext"))))) {
			if (StopLine.equals("")) {
				if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("edittextnu"))))) {
					edittext.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED);
				}
				if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("edittexterr"))))) {
					((EditText)edittext).setError(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("edittexterr")))));
				}
				d1.setView(edittext);
			}
		}
		if (StopLine.equals("")) {
			if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("setView"))))) {
				dl = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("setView"))));
				LinearLayout textView = textv3.get(Integer.parseInt(dl));
				fg = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/Dialog/")).concat(Dialogs.concat("/".concat(Dialogs).concat("setViewid"))));
				if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(fg.concat("/".concat(fg).concat("tr"))))) {
					int im =0;
					line = new Gson().fromJson(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(fg.concat("/".concat(fg).concat("tr")))), new TypeToken<ArrayList<String>>(){}.getType());
					if (!line.isEmpty()) {
						for(int _repeat487 = 0; _repeat487 < (int)(line.size()); _repeat487++) {
							String stringValue = line.get(im);
							int intValue = Integer.parseInt(stringValue);
							View textVie = textline.get(intValue);
							textView.addView(textVie);
							im++;
						}
					}
				}
				d1.setView(textView);
			}
			alertDialog = d1.create();
			alertDialog.show();
		}
	}
		public static void _savein() {
		if (saveline.contains("setData")) {
			dl = "setData";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (StopLine.equals("")) {
										toast = m3.group();
										save2 = m.getSharedPreferences(toast, Activity.MODE_PRIVATE);
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
										save2 = m.getSharedPreferences(toast, Activity.MODE_PRIVATE);
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2(dl, error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	public static void _saveint() {
		if (saveline.contains("SaveInt")) {
			dl = "SaveInt";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (StopLine.equals("")) {
										mpt = m3.group();
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										mpt = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
						Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
						while (m4.find()) {
								
								String regex = "^[0-9]+$";
							
							     
							toast = m4.group().replaceAll("\\s", "");
							if (toast.matches(regex)) {
								if (StopLine.equals("")) {
									a = toast;
									save2.edit().putInt(mpt, Integer.parseInt(a)).apply();
								}
							}
							else {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m4.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										a = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m4.group()))).replaceAll("\\s", ""));
										save2.edit().putInt(mpt, Integer.parseInt(a)).apply();
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m4.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2(dl, error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}

	
	public static void _getInt() {
		if (saveline.contains(".getInt")) {
			dl = ".getInt";
			fg = "getInt";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData")))).contains("int ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData")))).contains("int ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat("IntData")))).contains("int ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													a = m3.group();
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(Stringck))), String.valueOf((long)(save2.getInt(a, 0))));
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
										if (StopLine.equals("")) {
											a = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(Stringck))), String.valueOf((long)(save2.getInt(a, 0))));
										}
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
public static void _edString() {
		if (saveline.contains("edString")) {
			dl = "edString";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (StopLine.equals("")) {
										toast = m3.group();
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
						Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
						while (m4.find()) {
								
								if (m4.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
								while (m3.find()) {
										
										if (StopLine.equals("")) {
										a = m3.group();
										try {
											    Field field = cl.getDeclaredField(toast);
											    field.setAccessible(true);
											    field.set(m, a);
											
											    String modifiedValue = (String) field.get(m);
										} catch (NoSuchFieldException | IllegalAccessException e) {
											    e.printStackTrace();
										}
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										a = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""));
										try {
											    Field field = cl.getDeclaredField(toast);
											    field.setAccessible(true);
											    field.set(m, a);
											
											    String modifiedValue = (String) field.get(m);
										} catch (NoSuchFieldException | IllegalAccessException e) {
											    e.printStackTrace();
										}
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m4.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2(dl, error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	public static void _getVirebil() {
		if (saveline.contains(".getField")) {
			dl = ".getField";
			fg = "getField";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {																				
									if (StopLine.equals("")) {									        try {
            String functionName = "_ClassDrive"; // اسم الدالة التي تريد تنفيذها

            Method method = cl.getDeclaredMethod(functionName);
            method.setAccessible(true);
            method.invoke(m);
            		FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), "");
											if (!pa.equals("")) {
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), pa);										        
										}	
        } catch (Exception e) {
            e.printStackTrace();
        }
																		
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
	//تم تطوير المكتبه من شخص واحد هو مصطفى وسام
//The library was developed by one person, Mustafa Wessam.
//Please assist the developer and improve the library.
//The library was developed for Android applications only.

	public static void _edInt() {
		if (saveline.contains("edDouble")) {
			dl = "edDouble";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (StopLine.equals("")) {
										toast = m3.group();
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
						Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
						while (m4.find()) {
								
								String regex = "^[0-9.]+$";
							
							     
							mpt = m4.group().replaceAll("\\s", "");
							if (mpt.matches(regex)) {
								if (StopLine.equals("")) {
									a = mpt;
									try {
										    Field field = cl.getDeclaredField(toast);
										    field.setAccessible(true);
										    field.set(m, Double.parseDouble(a));
									} catch (NoSuchFieldException | IllegalAccessException e) {
										    e.printStackTrace();
									}
								}
							}
							else {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m4.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										a = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m4.group()))).replaceAll("\\s", ""));
										try {
											    Field field = cl.getDeclaredField(toast);
											    field.setAccessible(true);
											    field.set(m, Double.parseDouble(a));
										} catch (NoSuchFieldException | IllegalAccessException e) {
											    e.printStackTrace();
										}
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m4.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2(dl, error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _edInt2() {
		if (saveline.contains("edInt")) {
			dl = "edInt";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (StopLine.equals("")) {
										toast = m3.group();
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
						Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
						while (m4.find()) {
								
								String regex = "^[0-9]+$";   
							mpt = m4.group().replaceAll("\\s", "");
							if (mpt.matches(regex)) {
								if (StopLine.equals("")) {
									a = mpt;
									try {
										    Field field = cl.getDeclaredField(toast);
										    field.setAccessible(true);
										    field.set(m, Integer.parseInt(a));
									} catch (NoSuchFieldException | IllegalAccessException e) {
										    e.printStackTrace();
									}
								}
							}
							else {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m4.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										a = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m4.group()))).replaceAll("\\s", ""));
										try {
											    Field field = cl.getDeclaredField(toast);
											    field.setAccessible(true);
											    field.set(m, Integer.parseInt(a));
										} catch (NoSuchFieldException | IllegalAccessException e) {
											    e.printStackTrace();
										}
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m4.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2(dl, error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	
	
	public static void _edBaool() {
		if (saveline.contains("edBoolean")) {
			dl = "edBoolean";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (StopLine.equals("")) {
										toast = m3.group();
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
						Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
						while (m4.find()) {
								
								mpt = m4.group().replaceAll("\\s", "");
							if (mpt.equals("true")) {
							if (StopLine.equals("")) {
								try {
									    Field field = cl.getDeclaredField(toast);
									    field.setAccessible(true);
									    field.set(m, true);
								} catch (NoSuchFieldException | IllegalAccessException e) {
									    e.printStackTrace();
								}
							}
							}
							else {
								if (mpt.equals("false")) {
								if (StopLine.equals("")) {
									try {
										    Field field = cl.getDeclaredField(toast);
										    field.setAccessible(true);
										    field.set(m, false);
									} catch (NoSuchFieldException | IllegalAccessException e) {
										    e.printStackTrace();
									}
								}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(mpt));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2(dl, error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
	public static void _setOrientation2() {
		if (saveline.contains(".setOrientation")) {
			dl = ".setOrientation";
			fg = "setOrientation";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/".concat("ViewAll.txt")))).contains("ViewAll ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											toast = m2.group().replaceAll("\\s", "");
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
											edvi = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/ViewAll/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))));
											if (toast.equals("HORIZONTAL")) {
											if (StopLine.equals("")) {
													int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																						View view = m.findViewById(resourceId);
			  try {
													              view.getClass().getMethod("setOrientation", int.class).invoke(view, LinearLayout.HORIZONTAL);
													            } catch (Exception e) {
													                // يمكنك إدراج معالجة الاستثناء هنا إذا كنت بحاجة إليها
													            }																			
																						           }	
																						           }		
											else {
											if (toast.equals("VERTICAL")) {
											if(StopLine.equals("")) {
													int resourceId = m.getResources().getIdentifier(edvi, "id", m.getPackageName());
																						View view = m.findViewById(resourceId);
			try {
													              view.getClass().getMethod("setOrientation", int.class).invoke(view, LinearLayout.VERTICAL);
													            } catch (Exception e) {
	   }				
	  		         }	
	  		         }		
											else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(toast.concat("\n".concat(""))));
											}
										}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل View"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
					
				}
			}
		}
		else {
			
		}
	}
	
		public static void _ClipboardManager() {
		if (saveline.contains("ClipboardManager")) {
		dl ="ClipboardManager";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (StopLine.equals("")) {										
									((ClipboardManager) m.getSystemService(m.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", m3.group()));	
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {										
										((ClipboardManager) m.getSystemService(m.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))));
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2(dl, error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
		public static void _publicview() {
		Dialogs = line1;												
							Dialogs = Dialogs.replace("(", "");
							Dialogs = Dialogs.replace(")", "");	
							Dialogs = Dialogs.replace(";", "");	
							Dialogs = Dialogs.replaceAll("\\s", "");		
							Dialogs = Dialogs.replace("	", "");	
							fg =	line1;																		
		dl ="View Public";
						
				if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/public/".concat(Dialogs.concat("/".concat(Dialogs))))))) {
				s = "jjfjrj";
		    	if (saveline.contains(";")) {
		    	if (fg.contains("()")){
		    	if (StopLine.equals("")) {
					_imports("/data/user/0/".concat(pkgapp.concat("/public/".concat(Dialogs.concat("/".concat(Dialogs))))));	
					}
					}else{
					_erorr2(dl, error, "الرجاء كتابة () في الكود وتحقق من صحت الكود");
					}
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
				}
				else {				
					line1 = saveline;
				}
			
	}
	
		public static void _savebooale() {
		if (saveline.contains("SaveBoolean")) {
			dl = "SaveBoolean";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (StopLine.equals("")) {
										toast = m3.group();
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
						Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
						while (m4.find()) {
								fg = m4.group().replaceAll("\\s", "");	
								if (fg.equals("true")){
								if (StopLine.equals("")) {
								
								save2.edit().putBoolean(toast, true).commit();
								}
								}
								else{
								if (fg.equals("false")){
								if (StopLine.equals("")) {
								save2.edit().putBoolean(toast, false).commit();
								}
								}
								else{
								_erorr2(dl, error, "لم يتم التعرف على " + fg);
								}
								
								}
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2(dl, error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
		public static void _getDataBoolean() {
		if (saveline.contains(".getBoolean")) {
			dl = ".getBoolean";
			fg = "getBoolean";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), Boolean.toString(save2.getBoolean(m3.group(), false)));
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
										if (StopLine.equals("")) {
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), Boolean.toString(save2.getBoolean(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", "")), false)));
										}
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
	
	public static void DataBundel() {
		if (saveline.contains(".getDataBundel")) {
			dl = ".getDataBundel";
			fg = "getDataBundel";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
							toast = m2.group().replaceAll("\\s", "");	
							if (toast.equals("")) {
String DataBundel="";
FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), "");									
    Bundle bundle=m.getIntent().getExtras();
    for (String key : bundle.keySet()) {
        Object value = bundle.get(key);
        DataBundel+= String.format("%s %s (%s)", key, value.toString(), value.getClass().getName());
    }
    FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), DataBundel);									
								}else{
								_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
								}
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
		public static void getSignture() {
		if (saveline.contains(".getSignture")) {
			dl = ".getSignture";
			fg = "getSignture";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
							toast = m2.group().replaceAll("\\s", "");	
							if (toast.equals("")) {
String signature="";
    signature = getSignture(m);
    FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), signature);									
								}else{
								_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
								}
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
	public static String getSignture(Context context) {
	try {
				android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(
						m.getPackageName(), android.content.pm.PackageManager.GET_SIGNATURES);
		    //note sample just checks the first signature
				for (android.content.pm.Signature signature : packageInfo.signatures) {
						// SHA1 the signature
						String sha1 = getSHA1_(signature.toByteArray());
						// check is matches hardcoded value
						return sha1;
				}
	} catch(android.content.pm.PackageManager.NameNotFoundException e) {}
	
		return "";
	}
	
	
		  public static String getSHA1_(byte[] sig) {
		try {
			  		java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA1");
			digest.update(sig);
						byte[] hashtext = digest.digest();
						return bytes_To_Hex_(hashtext);
		} catch(java.security.NoSuchAlgorithmException e) {}
					return "";
		}
	  
	  //util method to convert byte array to hex string
	  public static String bytes_To_Hex_(byte[] bytes) {
		  	final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
							'9', 'A', 'B', 'C', 'D', 'E', 'F' };
				char[] hexChars = new char[bytes.length * 2];
				int v;
				for (int j = 0; j < bytes.length; j++) {
						v = bytes[j] & 0xFF;
						hexChars[j * 2] = hexArray[v >>> 4];
						hexChars[j * 2 + 1] = hexArray[v & 0x0F];
				}
				return new String(hexChars);
		}
		
		public static void getSHA1() {
		if (saveline.contains(".getSHA1")) {
			dl = ".getSHA1";
			fg = "getSHA1";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
							toast = m2.group().replaceAll("\\s", "");	
							if (toast.equals("")) {
			String sha1="";
String packageName = m.getPackageName(); // استبدل بالحزمة الفعلية لتطبيقك
int flags = PackageManager.GET_SIGNATURES; // تستبدل بالأعلام المناسبة لاحتياجاتك

try {
    PackageInfo packageInfo = m.getPackageManager().getPackageInfo(packageName, flags);
    Signature[] signatures = packageInfo.signatures;

    if (signatures != null && signatures.length >= 1) {
        CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
        ByteArrayInputStream input = new ByteArrayInputStream(signatures[0].toByteArray());
        Certificate cert = certFactory.generateCertificate(input);
        X509Certificate x509Cert = (X509Certificate) cert;

        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] encodedCert = x509Cert.getEncoded();
        byte[] certDigest = md.digest(encodedCert);

         sha1 = Utilities.toHexString(certDigest);
        // Process sha1Fingerprint as needed
    }
} catch (Exception e) {
    // Handle the exception
}
sha1 = sha1.replaceAll("\\s", "");
				sha1 = sha1.replace("\n", "");
    FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), sha1);									
								}else{
								_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
								}
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}

	public static void getSizeApp() {
		if (saveline.contains(".getSizeApp")) {
			dl = ".getSizeApp";
			fg = "getSizeApp";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
							toast = m2.group().replaceAll("\\s", "");	
							if (toast.equals("")) {
String size="";
  String appPath = m.getPackageCodePath();

        long appSize = getAppSize(appPath);
        String formattedSize = formatFileSize(appSize);
size=formattedSize;
    FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), size);									
								}else{
								_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
								}
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
	private static long getAppSize(String appPath) {
        File dir = new File(appPath);
        return dir.length();
    }

    private static String formatFileSize(long size) {
                double formattedSize = size;
                   formattedSize /= 1024.0;
        return String.format("%.1f", formattedSize);
        }
                              
        public static void _getEncode() {
		if (saveline.contains(".getEncode")) {
			dl = ".getEncode";
			fg = "getEncode";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
											String	string = m3.group();											
byte[] bytes = string.getBytes();
string = Base32.encode(bytes);
FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), string);
													}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
										if (StopLine.equals("")) {
										String	string = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));																					
byte[] bytes = string.getBytes();
string = Base32.encode(bytes);
FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), string);
}
}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
	
	public static void _getDecode() {
		if (saveline.contains(".getDecode")) {
			dl = ".getDecode";
			fg = "getDecode";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
											String	string = m3.group();
try {
	String string2 = new String(Base32.decode(string));
	FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), string2);
}
catch (Exception ex) {
}	
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
										String	string = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
try {
	String string2 = new String(Base32.decode(string));
	FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), string2);
}
catch (Exception ex) {
}	
										}
										else {
											_erorr2(fg, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
			public static void _getCrEncode() {
		if (saveline.contains("setCrEncode")) {
			dl = "setCrEncode";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
						while (m2.find()) {
								
								s = "jjfjrj";
							if (m2.group().contains("\"")) {
								Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
								while (m3.find()) {
										
										if (StopLine.equals("")) {
										String	string = m3.group();
											Base32.INSTANCE = new Base32(string);
									}
										
								}
							}
							else {
								stoperror = "dsdd";
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
									if (StopLine.equals("")) {
										String	string = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
											Base32.INSTANCE = new Base32(string);
									}
								}
								else {
									_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
								}
							}
								
						}
							
					}
					if (saveline.contains("(")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains(")")) {
						
					}
					else {
						if (stop.equals("")) {
							_erorr2(dl, error, "الرجاء كتابة ) وتحقق من صحت الكود");
						}
						else {
							
						}
					}
					if (saveline.contains("\"")) {
						
					}
					else {
						if (stop.equals("")) {
							if (stoperror.equals("")) {
								_erorr2(dl, error, "الرجاء كتابة \" وتحقق من صحت الكود");
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}

	
        public static class Base32 {
	
	private int SECRET_SIZE = 10;
	private java.security.SecureRandom RANDOM = new java.security.SecureRandom();
	private static Base32 INSTANCE = new Base32("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
	
	static Base32 getInstance() {
		return INSTANCE;
	}
	
	private String ALPHABET;
	private char[] DIGITS;
	private int MASK;
	private int SHIFT;
	private HashMap<Character, Integer> CHAR_MAP;
	
	final String SEPARATOR = "-";
	
	protected Base32(String alphabet) {
		this.ALPHABET = alphabet;
		DIGITS = ALPHABET.toCharArray();
		MASK = DIGITS.length - 1;
		SHIFT = Integer.numberOfTrailingZeros(DIGITS.length);
		CHAR_MAP = new HashMap<Character, Integer>();
		for (int i = 0; i < DIGITS.length; i++) {
			CHAR_MAP.put(DIGITS[i], i);
		}
	}
	
	public static byte[] decode(String encoded) throws DecodingException {
		return getInstance().decodeInternal(encoded);
	}
	
	protected byte[] decodeInternal(String encoded) throws DecodingException {
		encoded = encoded.trim().replaceAll(SEPARATOR, "").replaceAll(" ", "");
		encoded = encoded.replaceFirst("[=]*$", "");
		encoded = encoded.toUpperCase(Locale.US);
		
		if (encoded.length() == 0) {
			return new byte[0];
		}
		
		int encodedLength = encoded.length();
		int outLength = encodedLength * SHIFT / 8;
		byte[] result = new byte[outLength];
		int buffer = 0;
		int next = 0;
		int bitsLeft = 0;
		for (char c : encoded.toCharArray()) {
			if (!CHAR_MAP.containsKey(c)) {
				throw new DecodingException("Illegal character: " + c);
			}
			buffer <<= SHIFT;
			buffer |= CHAR_MAP.get(c) & MASK;
			bitsLeft += SHIFT;
			if (bitsLeft >= 8) {
				result[next++] = (byte) (buffer >> (bitsLeft - 8));
				bitsLeft -= 8;
			}
		}
		return result;
	}
	
	public static String encode(byte[] data) {
		return getInstance().encodeInternal(data);
	}
	
	protected String encodeInternal(byte[] data) {
		if (data.length == 0) {
			return "";
		}
		
		if (data.length >= (1 << 28)) {
			throw new IllegalArgumentException();
		}
		
		int outputLength = (data.length * 8 + SHIFT - 1) / SHIFT;
		StringBuilder result = new StringBuilder(outputLength);
		
		int buffer = data[0];
		int next = 1;
		int bitsLeft = 8;
		while (bitsLeft > 0 || next < data.length) {
			if (bitsLeft < SHIFT) {
				if (next < data.length) {
					buffer <<= 8;
					buffer |= (data[next++] & 0xff);
					bitsLeft += 8;
				}
				else {
					int pad = SHIFT - bitsLeft;
					buffer <<= pad;
					bitsLeft += pad;
				}
			}
			int index = MASK & (buffer >> (bitsLeft - SHIFT));
			bitsLeft -= SHIFT;
			result.append(DIGITS[index]);
		}
		return result.toString();
	}
	
	public class DecodingException extends Exception {
		public DecodingException(String message) {
			super(message);
		}
	}
	
	public String random() {
		byte[] buffer = new byte[SECRET_SIZE];
		RANDOM.nextBytes(buffer);
		byte[] secretKey = Arrays.copyOf(buffer, SECRET_SIZE);
		return encode(secretKey);
	}
}

	public static void _getClassName() {
		if (saveline.contains(".getClassName")) {
			dl = ".getClassName";
			fg = "getClassName";
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				getno = line1;
				getno = getno.replaceAll("\\s", "");
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							s = "jjfjrj";
						if (!m1.group().equals("")) {
							Stringck = line1.replace(m1.group(), "");
							Stringck = Stringck.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("StringData")))).contains("String ".concat(Stringck.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
								if (StopLine.equals("")) {
	String className = cl.getName();
	FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(Stringck))), className);

												}
								
										}										
								}				
							else {
								_erorr2(fg, error, "لم يتم العثور على ".concat(Stringck));
							}
						}
						else {
							_erorr2(fg, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
		else {
			
		}
	}
		
	public static void _WindowManager() {
		if (saveline.contains("WindowManager")) {
			dl = "WindowManager";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\+)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				lineck = line1.replace(dl, ",");
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
					lineck = lineck.replace(";", "");
						
				}
				if (lineck.equals("")) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							erorno = m1.group().replaceAll("\\s", "");
							if (!FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(erorno.concat(";")))) {
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/WindowManager")));
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(erorno));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).concat("\n".concat("WindowManager ".concat(erorno.concat(";")))));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(erorno.concat("/".concat(erorno.concat(dl)))), "true");
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(erorno.concat("/".concat(erorno.concat("id")))), String.valueOf((long)(in4)));
								int LAYOUT_FLAG;
if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
		    LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
} else {
		    LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_PHONE;
}
								final  WindowManager wm = (WindowManager) m.getSystemService(Context.WINDOW_SERVICE);
								final LinearLayout myView = new LinearLayout(m); 
								        
								    final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
    WindowManager.LayoutParams.WRAP_CONTENT,
    WindowManager.LayoutParams.WRAP_CONTENT,
    LAYOUT_FLAG,
      
    WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL 
     ,

    PixelFormat.TRANSLUCENT);
params.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
int pos = SketchwareUtil.getRandom((int)(0), (int)(1000));
 params.gravity = Gravity.TOP | Gravity.LEFT;
       params.x = (int)pos;
       params.y = (int)pos;   
								   textv4.add(wm);
								   winview.add(myView);
								   win3.add(params);
								in4++;
								if (StopLine.equals("")) {
									FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(erorno.concat("/".concat(erorno.concat("mo")))), "true");
								}
							}
							else {
								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(erorno.concat("/".concat(erorno.concat("mo")))))) {
									_erorr2(dl, error, "الرجاء تغير الاسم لان الاسم مستخدم من قبل عنصر اخر");
								}
							}
						}
						else {
							_erorr2(dl, error, "الرجاء كتابة اسم لل".concat(dl));
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابه ; نهاية الكود");
					}
					line1 = saveline;
					_belicolor();
				}
			}
			else {
				_addwind();
			}
		}
		else {
			_addwind();
		}
	}

		public static void _addwind() {
		if (saveline.contains(".addView")) {
			dl = ".addView";			
			
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m1002000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m1002000.find()) {
					
					ck = ck.replace(m1002000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							Dialogs = line1.replace(m1.group(), "");
							Dialogs = Dialogs.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(Dialogs.concat(";")))) {
									if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))) {									
										Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
										while (m2.find()) {
												
												if (m2.group().contains("\"")) {
												Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
												while (m3.find()) {
														
														if (m3.group().equals("") || m3.group().equals(" ")) {
														
													}
													else {
														if (StopLine.equals("")) {
													
														}
													}
														
												}
											}
											else {
												stoperror = "dsdd";
												if (FileUtil.isDirectory("/data/user/0/".concat(pkgapp.concat("/View/".concat(m2.group()))).replaceAll("\\s", ""))) {
												no = m2.group().replaceAll("\\s", "");	
														if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("LinearLayout"))))) {
	if (StopLine.equals("")) {												
														LinearLayout textView = winview.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
														WindowManager windo = textv4.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
                                                        WindowManager.LayoutParams params = win3.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
LinearLayout view = textv3.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("id"))))));
if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr"))))) {
					int im =0;
					line = new Gson().fromJson(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("tr")))), new TypeToken<ArrayList<String>>(){}.getType());
					if (!line.isEmpty()) {
						for(int _repeat810 = 0; _repeat810 < (int)(line.size()); _repeat810++) {
							String stringValue = line.get(im);
							int intValue = Integer.parseInt(stringValue);
							View textVie = textline.get(intValue);
							view.addView(textVie);
							im++;
						}
					}
				}
textView.addView(view);
FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(no.concat("/".concat(no).concat("tr"))), new Gson().toJson(line));
}
													}else {
												if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("Button"))))) {
													
														LinearLayout textView = winview.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
														WindowManager windo = textv4.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
                                                        WindowManager.LayoutParams params = win3.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
Button view = textv1.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("id"))))));

textView.addView(view);

													}else {
																								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("TextView"))))) {
	if (StopLine.equals("")) {												
														LinearLayout textView = winview.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
														WindowManager windo = textv4.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
                                                        WindowManager.LayoutParams params = win3.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
TextView view = textv.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("id"))))));

textView.addView(view);
}
													}else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("EditText"))))) {
	if (StopLine.equals("")) {												
														LinearLayout textView = winview.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
														WindowManager windo = textv4.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
                                                        WindowManager.LayoutParams params = win3.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
EditText view = textv2.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("id"))))));

textView.addView(view);
}
													}else {
													no = m2.group().replaceAll("\\s", "");	
													_erorr2(".addView", error, "لم يتم العثور على " + no);
													}
													}													}													}
													}else {
													no = m2.group().replaceAll("\\s", "");	
													_erorr2(".addView", error, "لم يتم العثور على " + no);
													}
												}
											}																						
									}
									else {
										_erorr2(".addView", error, "حدث خطاء الرجاء تحقق من صحت الكود");
									}								
							}
							else {
								_erorr2(dl, error, "لم يتم العثور على ".concat(Dialogs));
							}
						}
						else {
							_erorr2(dl, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
					if (saveline.contains(")")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة (");
					}
					if (saveline.contains("(")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة )");
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			} else {
			_WindowManager2();
			}
		}
		else {
		_WindowManager2();
		}
	}

        public static void _WindowManager2() {
		if (saveline.contains(".ViewLayout")) {
			dl = ".ViewLayout";
			fg = "ViewLayout";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(Dialogs.concat(";")))) {
								int ia=0;
														LinearLayout textView = winview.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
														WindowManager windo = textv4.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
                                                        WindowManager.LayoutParams params = win3.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
									while (m2.find()) {
											
											toast = m2.group().replaceAll("\\s", "");
										String regex = "^[0-9]+$";
										
										     
										if (toast.matches(regex)) {
											ia = Integer.parseInt(toast);
										}
										else {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
												ia = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", "")));
											}
											else {
										_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
											}
										}
										}	
									Matcher m3 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
									while (m3.find()) {
											
											toast = m3.group().replaceAll("\\s", "");
										String regex = "^[0-9]+$";
										
										     
										if (toast.matches(regex)) {
										if (StopLine.equals("")) {
										params.x = ia;
						params.y = Integer.parseInt(toast);
						 
										}
										}
										else {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m3.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
											toast = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m3.group()))).replaceAll("\\s", ""));										
											params.x = ia;
						params.y = Integer.parseInt(toast);
						 
											}
											}
											else {
										_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
										}
										}	
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل WindowManager"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
						if (saveline.contains(",")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة,");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
					}
				} else{
				_updateViewLayout();
				}
				}
				else {
					_updateViewLayout();
				}
			}
			public static void _updateViewLayout() {
		if (saveline.contains(".updateViewLayout")) {
			dl = ".updateViewLayout";
			fg = "updateViewLayout";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(Dialogs.concat(";")))) {
													final	LinearLayout textView = winview.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
											final			WindowManager windo = textv4.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
                                                final        WindowManager.LayoutParams params = win3.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											no = m2.group().replaceAll("\\s", "");
										
										     
										stoperror = "dsdd";
												if (FileUtil.isDirectory("/data/user/0/".concat(pkgapp.concat("/View/".concat(m2.group()))).replaceAll("\\s", ""))) {
																								if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("Button"))))) {
if (StopLine.equals("")) {
final Button bu = textv1.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("id"))))));
bu.setOnTouchListener(new OnTouchListener() {
		
		private int x;
		private int y;
		
		       @Override
		       public boolean onTouch(View v, MotionEvent event) {
				
				switch (event.getAction()) { 
						case MotionEvent.ACTION_DOWN: 
						x = (int) event.getRawX(); 
						y = (int) event.getRawY(); 
						break;
						case MotionEvent.ACTION_MOVE:
						int nowX = (int) event.getRawX(); 
						int nowY = (int) event.getRawY(); 
						int movedX = nowX - x; 
						int movedY = nowY - y; 
						x = nowX;
						y = nowY; 
						params.x = params.x + movedX; 
						params.y = params.y + movedY;
						windo.updateViewLayout(textView, params);  
						break;
						default:
						break;
				}
				 return true;
				 }
		 });
		 }
													}else {
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("LinearLayout"))))) {
if (StopLine.equals("")) {
final LinearLayout bu = textv3.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("id"))))));
bu.setOnTouchListener(new OnTouchListener() {
		
		private int x;
		private int y;
		
		       @Override
		       public boolean onTouch(View v, MotionEvent event) {
				
				switch (event.getAction()) { 
						case MotionEvent.ACTION_DOWN: 
						x = (int) event.getRawX(); 
						y = (int) event.getRawY(); 
						break;
						case MotionEvent.ACTION_MOVE:
						int nowX = (int) event.getRawX(); 
						int nowY = (int) event.getRawY(); 
						int movedX = nowX - x; 
						int movedY = nowY - y; 
						x = nowX;
						y = nowY; 
						params.x = params.x + movedX; 
						params.y = params.y + movedY;
						windo.updateViewLayout(textView, params);  
						break;
						default:
						break;
				}
				 return true;
				 }
		 });
		 }
													}else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("TextView"))))) {
													if (StopLine.equals("")) {
final TextView bu = textv.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("id"))))));
bu.setOnTouchListener(new OnTouchListener() {
		
		private int x;
		private int y;
		
		       @Override
		       public boolean onTouch(View v, MotionEvent event) {
				
				switch (event.getAction()) { 
						case MotionEvent.ACTION_DOWN: 
						x = (int) event.getRawX(); 
						y = (int) event.getRawY(); 
						break;
						case MotionEvent.ACTION_MOVE:
						int nowX = (int) event.getRawX(); 
						int nowY = (int) event.getRawY(); 
						int movedX = nowX - x; 
						int movedY = nowY - y; 
						x = nowX;
						y = nowY; 
						params.x = params.x + movedX; 
						params.y = params.y + movedY;
						windo.updateViewLayout(textView, params);  
						break;
						default:
						break;
				}
				 return true;
				 }
		 });
		 }
													}else {
													if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("EditText"))))) {
if (StopLine.equals("")) {													
final EditText bu = textv2.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(no.concat("/".concat(no).concat("id"))))));
bu.setOnTouchListener(new OnTouchListener() {
		
		private int x;
		private int y;
		
		       @Override
		       public boolean onTouch(View v, MotionEvent event) {
				
				switch (event.getAction()) { 
						case MotionEvent.ACTION_DOWN: 
						x = (int) event.getRawX(); 
						y = (int) event.getRawY(); 
						break;
						case MotionEvent.ACTION_MOVE:
						int nowX = (int) event.getRawX(); 
						int nowY = (int) event.getRawY(); 
						int movedX = nowX - x; 
						int movedY = nowY - y; 
						x = nowX;
						y = nowY; 
						params.x = params.x + movedX; 
						params.y = params.y + movedY;
						windo.updateViewLayout(textView, params);  
						break;
						default:
						break;
				}
				 return true;
				 }
		 });
		 }
													}else {
													no = m2.group().replaceAll("\\s", "");	
													_erorr2(fg, error, "لم يتم العثور على " + no);
													}
													}
													}
													}
										}								
										}	
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل WindowManager"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
					}
				} else{
				_WindowShow();
				}
				}
				else {
				_WindowShow();	
				}
			}
			public static void _WindowShow() {
		if (saveline.contains(".WindowShow()")) {
			dl = ".WindowShow()";
			fg = "WindowShow()";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(Dialogs.concat(";")))) {
								
										final				LinearLayout textView = winview.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
								final						WindowManager windo = textv4.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
                                    final                    WindowManager.LayoutParams params = win3.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											if (StopLine.equals("")) {
			if (android.provider.Settings.canDrawOverlays(m)) {
			windo.addView(textView, params);
	
} else {
			Intent intent = new Intent(android.provider.Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
			Uri.parse("package:" + m.getPackageName()));
			m.startActivity(intent);
}
}
										}	
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل WindowManager"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
						
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				
				} else{
				_WindowManagerLayoutParams();
				}
				}
				else {
				_WindowManagerLayoutParams();	
				}
			}
				public static void _WindowManagerLayoutParams() {
		if (saveline.contains(".LayoutParams")) {
			dl = ".LayoutParams";
			fg = "LayoutParams";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(Dialogs.concat(";")))) {
												LinearLayout textView = winview.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
														WindowManager windo = textv4.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
                                                        WindowManager.LayoutParams params = win3.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));	                                                     
			
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
									while (m2.find()) {
											
											toast = m2.group().replaceAll("\\s", "");
										String regex = "^[0-9]+$";
										
										     
										if (toast.matches(regex)) {
											cke3 = Integer.parseInt(toast);
										}
										else {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", ""))) {
												cke3 = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m2.group()))).replaceAll("\\s", "")));
											}
											else {
												if (toast.equals("WRAP_CONTENT")) {
													cke3 = WindowManager.LayoutParams.WRAP_CONTENT;
												}
												else {
													if (toast.equals("MATCH_PARENT")) {
														cke3 = WindowManager.LayoutParams.MATCH_PARENT;
													}
													else {
														_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
													}
												}
											}
										}
											
									}
									Matcher m3 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
									while (m3.find()) {
											
											toast = m3.group().replaceAll("\\s", "");
										String regex = "^[0-9]+$";
										
										     
										if (toast.matches(regex)) {
														if (StopLine.equals("")) {			 
					cke4 = Integer.parseInt(toast);							
					int wrapContent =(int) cke3;
					int wrapContent2=(int)cke4;
					params.width = wrapContent; // استبدل newWidth بالقيمة الجديدة للعرض
					params.height = wrapContent2; // استبدل newHeight بالقيمة الجديدة للارتفاع
					
					
					
				}											
										}
										else {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m3.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												cke4 = Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/int/".concat(m3.group()))).replaceAll("\\s", "")));
					
					int wrapContent =(int) cke3;
					int wrapContent2=(int)cke4;
					params.width = wrapContent; // استبدل newWidth بالقيمة الجديدة للعرض
					params.height = wrapContent2; // استبدل newHeight بالقيمة الجديدة للارتفاع
					
					
					
				}
											}
											else {
												if (toast.equals("WRAP_CONTENT")) {
												if (StopLine.equals("")) {
												cke4 = WindowManager.LayoutParams.WRAP_CONTENT;
					
					int wrapContent =(int) cke3;
					int wrapContent2=(int)cke4;
					params.width = wrapContent; // استبدل newWidth بالقيمة الجديدة للعرض
					params.height = wrapContent2; // استبدل newHeight بالقيمة الجديدة للارتفاع
					
					
					
				}
												
												}
												else {
													if (toast.equals("MATCH_PARENT")) {
													if (StopLine.equals("")) {
												cke4 = WindowManager.LayoutParams.MATCH_PARENT;
					
					int wrapContent =(int) cke3;
					int wrapContent2=(int)cke4;
					params.width = wrapContent; // استبدل newWidth بالقيمة الجديدة للعرض
					params.height = wrapContent2; // استبدل newHeight بالقيمة الجديدة للارتفاع
					
					
					
				}													
													}
													else {
														_erorr2(fg, error, "لم يتم العثور على ".concat(toast));
													}
												}
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل WindowManager"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
						if (saveline.contains(",")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة,");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
				_WindowClose();	
				}
			}
		}
		else {
			_WindowClose();
		}
	}
	public static void _WindowClose() {
		if (saveline.contains(".WindowClose()")) {
			dl = ".WindowClose()";
			fg = "WindowClose()";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/".concat("WindowManager.txt")))).contains("WindowManager ".concat(Dialogs.concat(";")))) {
								
										final				LinearLayout textView = winview.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
								final						WindowManager windo = textv4.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
                                    final                    WindowManager.LayoutParams params = win3.get(Integer.parseInt(FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/WindowManager/")).concat(Dialogs.concat("/".concat(Dialogs).concat("id"))))));										
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											if (StopLine.equals("")) {
windo.removeView(textView);
    
    

}
										}	
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل WindowManager"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
						
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				
				} else{
				
				}
				}
				else {
				
				}
			}
			
			public static void _setVisibilityView() {
		if (saveline.contains(".setVisibility")) {
			dl = ".setVisibility";
			fg = "setVisibility";
			
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				eroor = line1.replaceAll("\\s", "");
				if (eroor.contains(dl.concat("("))) {
					line1 = line1.replace(dl, ",");
					lineck = line1;
					Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
					while (m1000000.find()) {
							
							Dialogs = line1.replace(m1000000.group(), "");
						Dialogs = Dialogs.replaceAll("\\s", "");
						if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
							lineck = lineck.replace(m1000000.group(), "");
							lineck = lineck.replaceAll("\\s", "");
							lineck = lineck.replace(Dialogs, "");
							lineck = lineck.replace("	", "");
						}
							
					}
					if (lineck.equals("")) {
						Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
						while (m1.find()) {
								
								if (!m1.group().equals("")) {
								s = "jjfjrj";
								Dialogs = line1.replace(m1.group(), "");
								Dialogs = Dialogs.replaceAll("\\s", "");
								if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/View/".concat("View.txt")))).contains("View ".concat(Dialogs.concat(";")))) {
									Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
									while (m2.find()) {
											
											if (StopLine.equals("")) {
											if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/View/")).concat(Dialogs.concat("/".concat(Dialogs).concat("name"))))) {
												toast = m2.group().replaceAll("\\s", "");
												if (toast.equals("GONE")) {
													cks = "setVisibility";
														cke = "GONE";
														_text();
													
												}
												else {
													if (toast.equals("VISIBLE")) {
														cks = "setVisibility";
														cke = "VISIBLE";
														_text();													
													}
													else {
														if (toast.equals("INVISIBLE")) {
														cks = "setVisibility";
														cke = "INVISIBLE";
														_text();														
														}
														else {
															_erorr2(fg, error, "الرجاء كتابة ما الذي يحصل للعنصر");
														}
													}
												}
											}
										}
											
									}
								}
								else {
									_erorr2(fg, error, "لم يتم العثور على ".concat(Dialogs.concat("\n".concat("او لم تقم بعمل TextView"))));
								}
							}
							else {
								_erorr2(fg, error, "الرجاء تحقق من الكود");
							}
								
						}
						if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
					}
					else {
						if (saveline.contains(";")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة ; نهاية الكود");
						}
						line1 = saveline;
					}
				}
				else {
				_addtextview();	
				}
			}
		}
		else {
		_addtextview();	
		}
	}
		public static void _fierbes() {
		if (saveline.contains("Firebase ")) {
			dl="Firebase";
			ck = line1.replace("+", "");
			ck = ck.replace(dl, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\+)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(dl, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						lineck = lineck.replace(m1000000.group(), "");
					lineck = lineck.replaceAll("\\s", "");
					lineck = lineck.replace("	", "");
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							erorno = m1.group().replaceAll("\\s", "");
							if (!FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt")))).contains("firebase ".concat(erorno.concat(";")))) {
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/firebase")));
								FileUtil.makeDir("/data/user/0/".concat(pkgapp.concat("/firebase/")).concat(erorno));
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/String/".concat("ChatSuccess()"))), "حدث خطاء الرجاء اعادة المحاولة");
								FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt"))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt")))).concat("\n".concat("firebase ".concat(erorno.concat(";")))));
								_firebase = FirebaseDatabase.getInstance();
					drivefier = _firebase.getReference("Drive");
					_drivefier_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		drivefier.addChildEventListener(_drivefier_child_listener);

							}
						}
						else {
							_erorr2(dl, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
					_firebaseadd();
				}
			}
			else {
				_firebaseadd();
			}
		}
		else {
			_firebaseadd();
		}
	}
		
		public static void _firebaseadd() {
		if (saveline.contains(".put")) {
		String mw="";
			dl = "put";
			fg = ".put";
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(fg, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt")))).contains("firebase ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(fg, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(line1);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt")))).contains("firebase ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							TelegramBot = line1.replace(m1.group(), "");
							TelegramBot = TelegramBot.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt")))).contains("firebase ".concat(TelegramBot.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\,)").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
												mw=m3.group();
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
											mw=FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
														}
										}
										else {
											_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
										Matcher m4 = Pattern.compile("(?<=\\,)(.*)(?=\\))").matcher(saveline);
								while (m4.find()) {
										
										if (m4.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m4.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
													FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/firebase/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat(dl))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat(dl))))+"\n"+","+mw+";"+"("+m3.group()+")");
													
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/firebase/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat(dl))), FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat(dl))))+"\n"+","+mw+";"+"("+FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m4.group()))).replaceAll("\\s", ""))+")");											
												
											}
										}
										else {
											_erorr2(dl, error, "لم يتم العثور على ".concat(m4.group()));
										}
									}
										
								}
							}
							else {
								_erorr2(dl, error, "لم يتم العثور على ".concat(TelegramBot.concat("\nاو لم تقم بانشاء firebase")));
							}
						}
						else {
							_erorr2(dl, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
					if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
				}
				else {
					line1 = saveline;
				}
				if (saveline.contains(";")) {
					
				}
				else {
					_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
				}
			}
		}
		else {
			_firebaseadd1();
		}
	}

public static void _firebaseadd1() {
		if (saveline.contains(".FirebaseName")) {
		String mw="";
			dl = "FirebaseName";
			fg = ".FirebaseName";
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(fg, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt")))).contains("firebase ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(fg, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(line1);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt")))).contains("firebase ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							TelegramBot = line1.replace(m1.group(), "");
							TelegramBot = TelegramBot.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt")))).contains("firebase ".concat(TelegramBot.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
												mw=m3.group();
												drivefier = _firebase.getReference(mw);
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
											mw=FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
											drivefier = _firebase.getReference(mw);
														}
										}
										else {
											_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							
							}
							else {
								_erorr2(dl, error, "لم يتم العثور على ".concat(TelegramBot.concat("\nاو لم تقم بانشاء firebase")));
							}
						}
						else {
							_erorr2(dl, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
					if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
				}
				else {
					line1 = saveline;
				}
				if (saveline.contains(";")) {
					
				}
				else {
					_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
				}
			}
		}
		else {
			_firebaseadd2();
		}
	}


public static void _firebaseadd2() {
		if (saveline.contains(".addKey")) {
		String mw="";
			dl = "addKey";
			fg = ".addKey";
			Matcher mu = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(line1);
			while (mu.find()) {
					
					line1 = line1.replace(mu.group(), "");
					
			}
			ck = line1.replace("+", "");
			ck = ck.replace(fg, "+");
			ck = ":".concat(ck);
			Matcher m100018000 = Pattern.compile("(?<=\\=)(.*)(?=\\;)").matcher(ck);
			while (m100018000.find()) {
					
					ck = ck.replace(m100018000.group(), "");
					
			}
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt")))).contains("firebase ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(fg, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(line1);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt")))).contains("firebase ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							TelegramBot = line1.replace(m1.group(), "");
							TelegramBot = TelegramBot.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt")))).contains("firebase ".concat(TelegramBot.concat(";")))) {
								Matcher m2 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(saveline);
								while (m2.find()) {
										
										if (m2.group().contains("\"")) {
										Matcher m3 = Pattern.compile("(?<=\\\")(.*)(?=\\\")").matcher(m2.group());
										while (m3.find()) {
												
												if (m3.group().equals("") || m3.group().equals(" ")) {
												
											}
											else {
												if (StopLine.equals("")) {
												FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/firebase/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat(dl))), m3.group());
												
												}
											}
												
										}
									}
									else {
										stoperror = "dsdd";
										if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""))) {
											if (StopLine.equals("")) {
											mw=FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/String/".concat(m2.group()))).replaceAll("\\s", ""));
											FileUtil.writeFile("/data/user/0/".concat(pkgapp.concat("/firebase/")).concat(TelegramBot.concat("/".concat(TelegramBot).concat(dl))), mw);
														}
										}
										else {
											_erorr2(dl, error, "لم يتم العثور على ".concat(m2.group()));
										}
									}
										
								}
							
							}
							else {
								_erorr2(dl, error, "لم يتم العثور على ".concat(TelegramBot.concat("\nاو لم تقم بانشاء firebase")));
							}
						}
						else {
							_erorr2(dl, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
					if (saveline.contains(")")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة (");
						}
						if (saveline.contains("(")) {
							
						}
						else {
							_erorr2(fg, error, "الرجاء كتابة )");
						}
				}
				else {
					line1 = saveline;
				}
				if (saveline.contains(";")) {
					
				}
				else {
					_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
				}
			}
		}
		else {
			_senddrive();
		}
	}

		
	public static void _senddrive() {
		if (saveline.contains(".send()")) {
		String firebase="";
		dl="send()";
		fg=".send()";	
			ck = line1.replace("+", "");
			ck = ck.replace(fg, "+");
			ck = ":".concat(ck);
			Matcher m10009000 = Pattern.compile("\\:(.*)\\+").matcher(ck);
			while (m10009000.find()) {
					
					ck = m10009000.group();
				ck = ck.replace("+", "");
				ck = ck.replace(":", "");
				ck = ck.replaceAll("\\s", "");
				ck = ck.replace("	", "");
				if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt")))).contains("firebase ".concat(ck.concat(";")))) {
					ck = "";
				}
					
			}
			if (ck.equals("")) {
				line1 = line1.replace(fg, ",");
				lineck = line1;
				Matcher m1000000 = Pattern.compile("\\,(.*)\\;").matcher(lineck);
				while (m1000000.find()) {
						
						Dialogs = line1.replace(m1000000.group(), "");
					Dialogs = Dialogs.replaceAll("\\s", "");
					if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt")))).contains("firebase ".concat(Dialogs.concat(";")))) {
						lineck = lineck.replace(m1000000.group(), "");
						lineck = lineck.replaceAll("\\s", "");
						lineck = lineck.replace(Dialogs, "");
						lineck = lineck.replace("	", "");
					}
						
				}
				if (lineck.equals("")) {
					Matcher m1 = Pattern.compile("\\,(.*)\\;").matcher(line1);
					while (m1.find()) {
							
							if (!m1.group().equals("")) {
							s = "jjfjrj";
							firebase = line1.replace(m1.group(), "");
							firebase = firebase.replaceAll("\\s", "");
							if (FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/".concat("firebase.txt")))).contains("firebase ".concat(firebase.concat(";")))) {
								if (StopLine.equals("")) {
								firebasedrive = new HashMap<>();
								try {
				if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/firebase/")).concat(firebase.concat("/".concat(firebase).concat("put"))))) {
										tokenbot = "/data/user/0/".concat(pkgapp.concat("/firebase/")).concat(firebase.concat("/".concat(firebase).concat("put")));
										
									}
		        Scanner input = new Scanner(new File(tokenbot));
		        while (input.hasNextLine()) {
			            String data1 = input.nextLine();
			            String data2=data1;
			data1 = data1.replaceAll("\\s", "");
			if(!data1.equals("")){
			Matcher mf = Pattern.compile("(?<=\\,)(.*)(?=\\;)").matcher(data2);
			while (mf.find()) {
			Matcher mf1 = Pattern.compile("(?<=\\()(.*)(?=\\))").matcher(data2);
			while (mf1.find()) {
			firebasedrive.put(mf.group(), mf1.group());
			}
			}
			}
			
			   	}
		
		    input.close();
		    if (FileUtil.isFile("/data/user/0/".concat(pkgapp.concat("/firebase/")).concat(firebase.concat("/".concat(firebase).concat("addKey"))))) {
										tokenbot = FileUtil.readFile("/data/user/0/".concat(pkgapp.concat("/firebase/")).concat(firebase.concat("/".concat(firebase).concat("addKey"))));
										drivefier.child(tokenbot).updateChildren(firebasedrive);
										
									}else{
			drivefier.push().updateChildren(firebasedrive);
			}
					} catch(Exception e) {
						
				}									
									}
							}
							else {
								_erorr2(dl, error, "لم يتم العثور على ".concat(firebase.concat("\nاو لم تقم بانشاء firebase")));
							}
						}
						else {
							_erorr2(dl, error, "الرجاء تحقق من الكود صحيح");
						}
							
					}
				}
				else {
					if (saveline.contains(";")) {
						
					}
					else {
						_erorr2(dl, error, "الرجاء كتابة ; نهاية الكود");
					}
					line1 = saveline;
				}
			}
		}
	}
				
}

//تم تطوير المكتبه من شخص واحد هو مصطفى وسام
//The library was developed by one person, Mustafa Wessam.
//Please assist the developer and improve the library.
//The library was developed for Android applications only.