<template>
  <div class="container">
    <h1 class="title">
      Raamatu laenutamine
    </h1>
    <raamat-list :raamatud="raamatud" />
  </div>
</template>

<script>
import RaamatList from '~/components/RaamatList.vue'
export default {
  components: {
    RaamatList
  },
  data () {
    return {
      raamatud: {
        type: Array
      }
    }
  },
  asyncData (ctx) {
    return {
      raamatud: [
        {
          'id': '1',
          'pealkiri': 'A',
          'broneeritud': false,
          'laenutatud': false,
          'kuup2ev': null
        },
        {
          'id': '2',
          'pealkiri': 'B',
          'broneeritud': true,
          'laenutatud': false,
          'kuup2ev': null
        }
      ]
    }
  }
}
</script>