<!--html-->
<template>
  <div class="Medicine">
    <Table ref="tab" :util="{
      httpUrl:'/medicine',
      params:'',
      //id:' 主键'
      medicine:'药品名称',
      price:'价格/元',
      content:'说明书',
      category:'药品类别//cid',  //是一个路径，必须和字段名一样
      ctime:'上架时间///日期',
      photo:'图片//file'
    }" :curpage="1"
      :headhide='headhide'>
  <el-button type="primary" @click="buy()">购买</el-button>
    </Table>

  </div>
</template>

<!--JavaScript-->
<script lang="js">
import {reactive, toRefs} from "vue";


export default {
  name: "Medicine",
  components: {},
  data(){
    return{
      headhide:0,
    }
  },
  methods:{
    buy(){
      let uid=localStorage.getItem('uid')
      let row=this.$refs.tab.checkRowCheck()
      if(row){
        console.log(row)
        //向数据库中添加购买的药品
        let params={
          uid:uid,
          mid:row.id
        }
        this.$http.post('/medicineorder',params)
            .then(res=>{
              alert("购买成功"+res)
            })

      }

    }

  },
  mounted() {
    let status=localStorage.getItem('status')
    if(status=='超级管理员'){
      this.headhide=0
    }else{
      this.headhide=123
    }
  },



  setup() {
    let state = reactive({
      list: []
    })

    let data = reactive({
      list: []
    })

    let fun = () => {
      return 1;
    }

    return {
      ...state,
      ...toRefs(data),
    }
  }
}
</script>
<!--css-->
<style scoped lang="css">
.Medicine {


}
</style>