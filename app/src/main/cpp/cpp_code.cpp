//
// Created by others on 20/12/07.
//

#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jint JNICALL
Java_id_ac_ui_cs_mobileprogramming_michaelchristophermanullang_myapplication_FragmentA_getTxtLen(JNIEnv *env, jobject instance, jstring txt_) {
    const char *txt = env->GetStringUTFChars(txt_, 0);
    int len = strlen(txt);

    return len;
}

