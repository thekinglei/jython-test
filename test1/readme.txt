当jython调用cc.jar包时
举例：此时cc.jar中只有一个Aa.class文件


需要做：
import sys
sys.path.append("../../路径/cc.jar")
import Aa

