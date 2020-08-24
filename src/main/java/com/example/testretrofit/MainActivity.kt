package com.example.testretrofitimport android.os.Bundleimport android.util.Logimport android.widget.Toastimport androidx.appcompat.app.AppCompatActivityimport androidx.databinding.DataBindingUtilimport androidx.databinding.ObservableArrayListimport androidx.lifecycle.LifecycleOwnerimport androidx.lifecycle.LifecycleRegistryimport com.example.testretrofit.databinding.ActivityMainBindingimport java.util.*class MainActivity : AppCompatActivity(), Observer, LifecycleOwner, ApiServices {    private lateinit var lifecycleRegistry: LifecycleRegistry    lateinit var activityBinding: ActivityMainBinding    internal var viewModel: TestViewModel = TestViewModel()    internal var dataModel: DataModel = DataModel()    override fun onCreate(savedInstanceState: Bundle?) {        super.onCreate(savedInstanceState)        activityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)        /*import line for data bind*/        activityBinding.datamodel = dataModel        viewModel!!.addObserver(this)        lifecycle.addObserver(viewModel)        dataModel.setEmail("selva@gmail.com")        dataModel.setName("selva")//        activityBinding.edt2.setText("sds")//        activityBinding.edt1.setText("sds")        Log.i("TAG", "onCreate")//        viewModel.performClickOperation("Data Changed")        viewModel.number.set("343343")        viewModel.teztList.add("8")        viewModel.teztList.add("9")        viewModel.teztList.add("10")        viewModel.loadData()        var oh: ApiServices = this@MainActivity        oh.testFunctionTwo()//       this.testFunctionOne()    }    override fun update(o: Observable?, arg: Any?) {        if (arg is String) {            when (arg) {                "Data Changed" -> {                    Log.i("TAG", "DataChanged")//                    activityBinding.edt2.setText("DataChanged")                }//                    startActivity(Intent(this, RecyclerviewActivity::class.java))                else -> Log.i("Recycler", "Nothing")            }        } else if (arg is ObservableArrayList<*>) {            Toast.makeText(this, "" + arg.size, Toast.LENGTH_SHORT).show()            viewModel.number.set(arg.size.toString())        }    }    override fun testFunctionOne() {        Log.i("Ss", "call")        Toast.makeText(applicationContext, "first", Toast.LENGTH_SHORT).show()    }    override fun testFunctionTwo() {        Log.i("Ss", "call")        Toast.makeText(applicationContext, "second", Toast.LENGTH_SHORT).show()    }}